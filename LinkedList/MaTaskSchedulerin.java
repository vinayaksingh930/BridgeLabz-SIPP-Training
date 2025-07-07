class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskCircularLinkedList {
    private Task head;

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newTask;
        newTask.next = head;
    }

    public void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

public class MaTaskSchedulerin {
    public static void main(String[] args) {
        TaskCircularLinkedList taskList = new TaskCircularLinkedList();
        taskList.addTaskAtEnd(1, "Task 1", 1, "2023-10-01");
        taskList.addTaskAtEnd(2, "Task 2", 2, "2023-10-02");
        taskList.displayTasks();
    }
}