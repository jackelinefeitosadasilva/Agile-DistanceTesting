package ie.gmit.dip;
import java.util.*;


public class Distance {


	//class Distance to read, print and add distance
	
	private int feet;
	private int inches;
	private Scanner sc;
	
	public void getDistance()
	{
		sc = new Scanner(System.in);
		
		System.out.print("Enter feet: ");
		feet=sc.nextInt();
		System.out.print("Enter inches: ");
		inches=sc.nextInt();
	}
	public void showDistance()
	{
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	
	public void addDistance(Distance D1, Distance D2)
	{
		inches=D1.inches+D2.inches;
		feet=D1.feet+D2.feet+(inches/12);
		inches=inches%12;
	}
	


public static void main(String []s)
{	

}
public int divide(int i) {
	// TODO Auto-generated method stub
	return inches;
}

}