import java.util.*;
public class Handshakes{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int numberOfstudents=sc.nextInt();
		int combinations=(numberOfstudents*(numberOfstudents-1))/2;
		System.out.print("Number of handshakes "+combinations);
	}
}