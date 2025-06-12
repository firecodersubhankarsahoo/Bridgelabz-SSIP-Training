public class Vol_Of_Earth{
	public static void main(String args[]){
		int radius_in_km=6378;
		double radius_in_miles=radius_in_km*1.6;
		double volume_in_km=(4/3)*3.14*radius_in_km*radius_in_km*radius_in_km;
		double volume_in_miles=(4/3)*3.14*radius_in_miles*radius_in_miles*radius_in_miles;
		System.out.println("The volume of earth in cubic kilometers is "+volume_in_km+" and cubic miles is "+volume_in_miles);
	}
}