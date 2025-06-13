import java.util.*;
public class largest_number {
    public static void main(String[] args){
    // code
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        if(n1>n2&&n1>n3){
            System.out.println(n1+" the 1st number is the largest");
        } else if (n2>n1&&n2>n3) {
            System.out.println(n2+" the 2nd number is the largest");
        }else{
            System.out.println(n3+" the 3rd number is the largest");
        }

    }
}
