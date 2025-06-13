import java.util.*;
public class sum_natural_number_using_while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=n*(n+1)/2;
       int  sum2=0;
        while(n>0){
            sum2+=n;
            n--;
        }
        System.out.println("the sum of n natural number using the formula is "+sum);
        System.out.println("the sum of n natural number using the while loop is "+sum2);
        if(sum==sum2){
            System.out.println("the result of both computation is same and correct");
        }
    }
}
