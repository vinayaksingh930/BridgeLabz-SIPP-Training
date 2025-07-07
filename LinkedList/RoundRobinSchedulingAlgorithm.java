class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
            return;
        }
        Process temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newProcess;
        newProcess.next = head;
    }

    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) return;
        Process temp = head;
        do {
            if (temp.burstTime > 0) {
                System.out.println("Executing Process ID: " + temp.processId);
                if (temp.burstTime > timeQuantum) {
                    temp.burstTime -= timeQuantum;
                } else {
                    temp.burstTime = 0;
                    System.out.println("Process ID: " + temp.processId + " completed.");
                }
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.displayProcesses();
        scheduler.simulateRoundRobin(3);
        scheduler.displayProcesses();
    }
}