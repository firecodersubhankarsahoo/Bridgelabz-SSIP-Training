import java.util.ArrayList;

public class Q3_SuppressUncheckedWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

