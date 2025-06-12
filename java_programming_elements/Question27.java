import java.util.*;
public class Question27
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int temp;
temp=n1;
n1=n2;
n2=temp;	
System.out.print("The swapped numbers are "+n1+" and "+n2);
	
    }
}