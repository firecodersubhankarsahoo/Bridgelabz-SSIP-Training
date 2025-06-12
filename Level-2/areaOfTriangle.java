import java.util.Scanner;
class areaOfTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        	double base=sc.nextDouble();
        	double height=sc.nextDouble();
        	double areaInCmSquare=0.5*base*height;
        	double areaInInchSquare=areaInCmSquare/(2.54*2.54);
        	System.out.println("The Area of the triangle in sq cm is:"+areaInCmSquare+" and in sq in is:"+areaInInchSquare);
	}
}