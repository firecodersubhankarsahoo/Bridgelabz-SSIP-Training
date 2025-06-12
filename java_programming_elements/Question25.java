import java.util.*;
public class Question25
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
System.out.println("no of chocolet ");
int n=sc.nextInt();
System.out.println("no of child ");

int m=sc.nextInt();
int eachchi=n/m;
int left=n%m;
	
	System.out.print("The number of chocolates each child gets is "+eachchi+" and the number of remaining chocolates is "+left);
	
    }
}