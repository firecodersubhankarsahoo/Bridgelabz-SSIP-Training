import java.util.*;
public class Quotient_Remainder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int quotient=number1/number2;
		int remainder=number1%number2;
		System.out.print("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+number1+" and "+number2);
	}
}