package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;


public class Test_Data {
	
	private Test_Login Login;
	private Add_Package Package_list;
	private Logout logout;
	private Delete_Package delete;
 
	 @BeforeTest
	 public void setUp() throws InterruptedException {
	        System.setProperty("webdriver.edge.driver", "D:\\git\\KloudShip\\KloudShip\\drivers\\edgedriver_win64\\msedgedriver.exe");
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://ecs-qa.kloudship.com/signin"); 
	        Login = new Test_Login(driver);
	        Package_list = new Add_Package(driver);
	        logout = new Logout(driver);
	        delete = new Delete_Package(driver);
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	    }
	 @Test 
	    public void A_Login() throws InterruptedException {
	        
	
	        Login.enterEmail("kloudship.qa.automation@mailinator.com");
	        Login.enterPassword("Password1");
	        Login.loginForm();
	        Thread.sleep(3000);
	        //Add Package
	        Thread.sleep(1000);
	        Package_list.click_Package();
	 		Thread.sleep(3000);
	 		Package_list.add_button();
	 		Thread.sleep(3000);
	 		Package_list.enter_name("Ranjan");
	 		Package_list.enter_length("5");
	 		Package_list.selects_carrier();
	 		Package_list.enter_width("2");
	 		Package_list.selects_type();
	 		Package_list.enter_height("3");
	 		Package_list.check_status();
	 		Package_list.enter_location();
	 		Thread.sleep(3000);
	 		Package_list.submitForm();
	 		Thread.sleep(1000);
	 		//Logout
	 		logout.Logout_btns();
	 		System.out.println("TEST CASE 1 PASS");
	        
	    }

	 @Test
	    public void B_Delete_Pakage() throws InterruptedException {
		 	Thread.sleep(3000);
		 	Login.enterEmail("kloudship.qa.automation@mailinator.com");
	        Login.enterPassword("Password1");
	        Login.loginForm();
	        Thread.sleep(4000);
	        Package_list.click_Package();
	        Thread.sleep(1000);
	        delete.Delete_btns();
	        logout.Logout_btns();
	        System.out.println("TEST CASE 2 PASS");
	        
	    }
}
