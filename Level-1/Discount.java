public class Discount{
	public static void main(String args[]){
		int fee=125000;
		int discountPercent=10;
		int discount=(fee*discountPercent)/100;
		int discountPrice=fee-discount;
		System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+discountPrice);

	}
}