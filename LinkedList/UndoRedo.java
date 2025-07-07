class TextState {
    String content;
    TextState next;
    TextState prev;

    public TextState(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}

class TextEditor {
    private TextState current;
    private int maxHistorySize;
    private int historySize;

    public TextEditor(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.historySize = 0;
        this.current = null;
    }

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;

        // Limit history size
        historySize++;
        if (historySize > maxHistorySize) {
            TextState temp = current;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            temp.next.prev = null;
            temp.next = null;
            historySize--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No content available.");
        }
    }
}

public class UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);
        editor.addState("State 1");
        editor.addState("State 2");
        editor.addState("State 3");

        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();

        editor.addState("State 4");
        editor.addState("State 5");
        editor.addState("State 6"); // This will remove "State 1" due to max history size
        editor.displayCurrentState();
    }
}