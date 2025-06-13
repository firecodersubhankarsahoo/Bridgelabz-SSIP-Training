import java.util.*;
public class natural_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n+" is a natural no");
            int sum=n*(n+1)/2;
            System.out.println("the sum of "+n+" natural number is "+sum);
        }else {
            System.out.println(n+" is not a natural no");
        }
    }
}

