import java.util.*;
public class Question12
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int price=sc.nextInt();
	int qty=sc.nextInt();
	int tprice=price*qty;
	
	System.out.print("The total purchase price is INR " +tprice+" if the quantity "+qty+" and the unit price is INR "+price);
	
    }
}