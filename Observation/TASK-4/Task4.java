  import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int marks[];
    int total;
    double average;
    double percentage;

    Student(int rollNo, String name, int marks[]) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        return total;
    }

    double calculateAverage() {
        average = total / 5.0;
        return average;
    }

    int highestMarks() {
        int high = marks[0];

        for (int i = 1; i < 5; i++) {
            high = Math.max(high, marks[i]);
        }

        return high;
    }

    int lowestMarks() {
        int low = marks[0];

        for (int i = 1; i < 5; i++) {
            low = Math.min(low, marks[i]);
        }

        return low;
    }

    double calculatePercentage() {
        percentage = total * 100.0 / 500;
        return Math.round(percentage * 100.0) / 100.0;
    }

    String getGrade() {

        if (percentage >= 90) {
            return "A+";
        }
        else if (percentage >= 80) {
            return "A";
        }
        else if (percentage >= 70) {
            return "B";
        }
        else if (percentage >= 60) {
            return "C";
        }
        else if (percentage >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }

    String getResult() {
        if (percentage >= 50) {
            return "PASS";
        }
        else {
            return "FAIL";
        }
    }

    String getRemark() {

        if (percentage >= 90) {
            return "Excellent Performance";
        }
        else if (percentage >= 80) {
            return "Very Good Performance";
        }
        else if (percentage >= 70) {
            return "Good Performance";
        }
        else if (percentage >= 60) {
            return "Average Performance";
        }
        else if (percentage >= 50) {
            return "Needs Improvement";
        }
        else {
            return "Poor Performance";
        }
    }

    void displayDetails() {

        String formattedName = name.trim().toUpperCase();

        System.out.println("\n----- STUDENT PERFORMANCE REPORT -----");
        System.out.println("Roll Number     : " + rollNo);
        System.out.println("Student Name    : " + formattedName);
        System.out.println("Name Length     : " + formattedName.length());
        System.out.println("Total Marks     : " + calculateTotal());
        System.out.println("Average Marks   : " + calculateAverage());
        System.out.println("Highest Marks   : " + highestMarks());
        System.out.println("Lowest Marks    : " + lowestMarks());
        System.out.println("Percentage      : " + calculatePercentage() + "%");
        System.out.println("Grade           : " + getGrade());
        System.out.println("Result          : " + getResult());
        System.out.println("Remark          : " + getRemark());
    }
}

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int marks[] = new int[5];

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(rollNo, name, marks);

        s.displayDetails();

        sc.close();
    }
}