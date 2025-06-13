import java.util.*;
public class check_small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1<n2&& n1<n3){
            System.out.println("the first number "+n1+" is the smallest number");
        }else {
            System.out.println("the first number "+n1+" is not the smallest number");
        }
    }
}
