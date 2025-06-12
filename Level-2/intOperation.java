import java.util.Scanner;
public class intOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter integer a:");
        int a=sc.nextInt();
        System.out.print("enter integer b:");
        int b=sc.nextInt();
        System.out.print("enter integer c:");
        int c = sc.nextInt();

        int op1=a+b*c;
        int op2=a*b+c;
        int op3=c+a/b;
        int op4=a%b+c;
        System.out.println("The results of Int Operations are: "+op1+", "+op2+", "+op3+", and "+op4);
    }
}
