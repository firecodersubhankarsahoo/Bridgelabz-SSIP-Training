import java.util.*;

public class _11_factorial_using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int fac=1;
        for (int i=1;i<=n;i++){
            fac*=i;

        }
        System.out.println("factorial of "+n+" is "+fac);

    }
}
