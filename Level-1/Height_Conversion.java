import java.util.Scanner;
class Height_Conversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cm = sc.nextInt();
		float inchToCM = 2.54f;
		int footToInch = 12;
		float cmToInch = cm / inchToCM;
		float inchtofoot = cmToInch/ footToInch;
		System.out.println("Your Height in cm is " + cm + " while in feet is " + inchtofoot + " and inches is "+ cmToInch); 
	}
}