import java.util.*;
public class Question20
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int salary=sc.nextInt();
	int bonus=sc.nextInt();
	int income=salary+bonus;
	
	System.out.print("The salary is INR "+salary+" and the bonus is INR "+bonus+" Hence Total Income is INR "+income);
	
    }
}