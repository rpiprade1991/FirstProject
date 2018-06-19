package Test1;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGLearn extends ExtentReportsLearn {

	
	
	@Test(groups= {"Sanity"})
	public void one() {
		System.out.println("Test Sanity1");	
		 
		
	}
	@Test(groups= {"Sanity"})
	public void two() {
	
		System.out.println("Test Sanity2");	
		Assert.assertEquals(false, true);
	}
	@Test(groups= {"Regression"})
	public void three() {
		System.out.println("Test Regression");	
	}
}


