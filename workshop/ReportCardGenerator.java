import java.util.*;

// Custom exception class to handle invalid marks
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

// Student class to store details of each student
class Student {
    String name;         // Student name
    String[] subjects;   // Array to store subject names
    int[] marks;         // Array to store marks for each subject

    // Constructor with validation for marks
    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;

        // Validate that each mark is between 0 and 100
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid mark: " + mark + ". Must be between 0 and 100.");
            }
        }
    }

    // Method to calculate average marks
    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / (double) marks.length;
    }

    // Method to assign grade based on average
    public char assignGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    // Method to display the formatted report card
    public void displayReportCard() {
        System.out.println("Report Card for: " + name);
        System.out.println("---------------------------------");

        // Loop through each subject and print marks
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-10s : %3d\n", subjects[i], marks[i]);
        }

        // Display average and grade
        double avg = calculateAverage();
        System.out.printf("Average     : %.2f\n", avg);
        System.out.println("Grade       : " + assignGrade(avg));
        System.out.println("---------------------------------\n");
    }
}

// Main class to run the program
public class ReportCardGenerator {
    public static void main(String[] args) {
        // List to hold multiple student records
        List<Student> students = new ArrayList<>();

        try {
            // Adding students with subject names and marks
            students.add(new Student("Alice", new String[]{"Math", "Physics", "Chemistry"}, new int[]{95, 88, 92}));
            students.add(new Student("Bob", new String[]{"Math", "Physics", "Chemistry"}, new int[]{70, 65, 78}));
            students.add(new Student("Charlie", new String[]{"Math", "Physics", "Chemistry"}, new int[]{55, 40, 60}));

            // If you want to test exception, uncomment the next line
            // students.add(new Student("Invalid", new String[]{"Math"}, new int[]{110}));
        } catch (InvalidMarkException e) {
            // Handle exception for invalid marks
            System.out.println("Error: " + e.getMessage());
        }

        // Display report card for each student
        for (Student s : students) {
            s.displayReportCard();
        }
    }
}
