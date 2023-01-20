package TestNG;

import org.testng.annotations.Test;

public class SettingPriority {
	@Test(priority=1)
	public void method1() {
		System.out.println("Running TestNG method1 ");
	 }
	 
	@Test(priority=2)
	public void method2() {
		System.out.println("Running TestNG method2 ");
	 }
	
	@Test(priority=4)
	public void method4() {
		System.out.println("Running TestNG method4 ");
	 }
			 
	@Test(priority=0)
	public void method3() {
		System.out.println("Running TestNG method3 ");
	 }
	
	//Update number 2
	//update number 3
	//updated number 4 - File2
}
