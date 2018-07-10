package ie.gmit.dip;

public class AddTwoDistance {
	
	public static void main(String []s)
	{
		
			try
			{

				Distance D1=new Distance();
				Distance D2=new Distance();
				Distance D3=new Distance();
				
				//read first distance
				System.out.println("Enter first distance: ");
				D1.getDistance();
				
				//read second distance
				System.out.println("Enter second distance: ");
				D2.getDistance();
				
				//add distances
				D3.addDistance(D1,D2);
				//print distance
				System.out.println("Total distance is:" );
				D3.showDistance();
			}
			catch (Exception e)
			{
				System.out.println("Exception occurred :"+ e.toString());
			}
		}

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	}