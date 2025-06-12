import java.util.*;
public class question11
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int dist=sc.nextInt();
	double yard=(double)dist/3;
	double mile=(double)yard/1760;
	System.out.print("The distance in yards is "+yard+"  while the distance in miles is "+mile);
	
    }
}