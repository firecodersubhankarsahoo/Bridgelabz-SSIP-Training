import java.util.*;
public class Student_Discount{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int fee=sc.nextInt();
		int discountPercent=sc.nextInt();
		int discount=(fee*discountPercent)/100;
		int discountPrice=fee-discount;
		System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+discountPrice);

	}
}