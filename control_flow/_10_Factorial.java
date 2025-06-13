import java.util.*;

public class _10_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int fac=1;
        while (n>0){
            fac*=n;
            n--;
        }
        System.out.println("factorial of "+m+" is "+fac);

    }
}
