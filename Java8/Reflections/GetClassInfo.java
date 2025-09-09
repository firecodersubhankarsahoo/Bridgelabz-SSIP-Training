import java.lang.reflect.*;

public class GetClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.ArrayList");
        System.out.println("Methods:");
        for(Method m : cls.getDeclaredMethods()) System.out.println(m);
        System.out.println("Fields:");
        for(Field f : cls.getDeclaredFields()) System.out.println(f);
        System.out.println("Constructors:");
        for(Constructor<?> c : cls.getDeclaredConstructors()) System.out.println(c);
    }
}
