import java.util.*;
public class Question19
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int s1=sc.nextInt();
	int s2=sc.nextInt();
	int s3=sc.nextInt();
	int dist=5*1000;
	int peri=s1+s2+s3;
	int round=dist/peri;
	System.out.print("The total number of rounds the athlete will run is " +round+" to complete 5 km");
	
    }
}