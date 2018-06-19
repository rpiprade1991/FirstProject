package Test1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Anno {
	
	@Test(dataProvider= "data")
	public void show(String name,String sirname ) {
		
		System.out.println(name+ sirname);
	}
	
	@BeforeClass
	public void a() {
		System.out.println("Before Class");
	}
	
	@BeforeSuite
	public void b() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void c() {
		System.out.println("BeforeTest");
	}

	@Test
	public void d() {
		System.out.println("Test");
	}

	
	
	@DataProvider
	public Object[][]   data() {
		
		
		
		String arr[][]= new String [2][2];
		arr[0][0]="Rahul";
		arr[0][1]="Piprade";
		arr[1][0]="Aditya";
		arr[1][1]="Choudhari";
		
		
		return arr;
		
		
	}
}
