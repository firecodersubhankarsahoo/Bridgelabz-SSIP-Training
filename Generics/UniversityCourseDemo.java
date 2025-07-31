// Multi-Level University Course Management System
import java.util.*;

abstract class CourseType {
    String name;
    public CourseType(String name) { this.name = name; }
    public String getName() { return name; }
    public String toString() { return getClass().getSimpleName() + ": " + name; }
}
class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
}
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
}
class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
}

class Course<T extends CourseType> {
    private T courseType;
    public Course(T courseType) { this.courseType = courseType; }
    public T getCourseType() { return courseType; }
}

class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
}

public class UniversityCourseDemo {
    public static void main(String[] args) {
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse("Math Final"));
        allCourses.add(new AssignmentCourse("Java Project"));
        allCourses.add(new ResearchCourse("AI Thesis"));
        System.out.println("All Courses:");
        CourseManager.displayCourses(allCourses);
    }
}

