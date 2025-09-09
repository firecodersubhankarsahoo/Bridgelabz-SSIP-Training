import java.util.*;

class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}
