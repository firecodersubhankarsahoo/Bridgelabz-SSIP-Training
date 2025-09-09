
class Student {
    String name;
    Student() { name = "Default"; }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");
        Object obj = cls.getDeclaredConstructor().newInstance();
        System.out.println(((Student)obj).name);
    }
}
