class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}
public class Educational {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", 40, "Coursera", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science", 60, "Udemy", false, 199.99, 20.0);

        System.out.println("Course: " + course.courseName + ", Duration: " + course.duration + " days");
        System.out.println("Online Course: " + onlineCourse.courseName + ", Platform: " + onlineCourse.platform + ", Recorded: " + onlineCourse.isRecorded);
        System.out.println("Paid Online Course: " + paidOnlineCourse.courseName + ", Fee: $" + paidOnlineCourse.fee + ", Discount: $" + paidOnlineCourse.discount);
    }
}