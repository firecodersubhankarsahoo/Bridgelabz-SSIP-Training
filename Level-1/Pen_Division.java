public class Pen_Division{
	public static void main(String args[]){
		int numberOfpens=14;
		int numberOfstudents=3;
		int pen_remains=numberOfpens%numberOfstudents;
		int pen_per_student=numberOfpens/numberOfstudents;
		System.out.print("The Pen Per Student is "+pen_per_student+" and the remaining pen not distributed is "+pen_remains);
	}
}