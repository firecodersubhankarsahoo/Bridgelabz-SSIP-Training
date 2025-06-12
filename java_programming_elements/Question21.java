import java.util.*;
public class Question21
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	int pri=sc.nextInt();
	int rate=sc.nextInt();
	int time=sc.nextInt();
	float si=(float) (pri*rate*time)/100;
	
	System.out.print("The Simple Interest is "+ si +" for Principal"+  pri+", Rate of Interest "+ rate +" and Time"+ time);
	
    }
}