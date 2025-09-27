package Practice43Day;

import org.testng.annotations.*;

public class Annotations {
	
	@BeforeSuite
    public void beforesuite() {
		System.out.println("this is the beforeSuite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("this is the afterSuite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("this is the beforetest");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("this is the aftertest");
	}
	
	@BeforeMethod
	public void beformethod() {
		System.out.println("this is the beformethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is the afterMethod");
	}
	
	@Test(priority=1)
	void m1() {
		System.out.println("this is method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("this is the beforeclass");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("this is the afterclass");
	

}}
