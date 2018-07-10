package ie.gmit.dip;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTwoDistanceTesting {

private  Distance distance;
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("==set up class");
	}
	@Before
	public void setUp() {
		System.out.println("==setup");
	}
	
		
	@Test
	public void test() {
		Distance dt= new Distance();
		int result = dt.divide(12);
		assertNotNull(result);
	}
	
	}
