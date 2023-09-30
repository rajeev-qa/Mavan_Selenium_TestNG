package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Login {
	private WebDriver driver;
	
	
	public Test_Login(WebDriver driver) {
        this.driver = driver;
    }

	public void enterEmail(String email) {
	        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"login-email\"]"));
	        emailField.sendKeys(email);
	        
	    }
	 
	public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        passwordField.sendKeys(password);
    }
	
	public void loginForm() {
        WebElement loginForm = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button/span"));
        loginForm.click();
    }
	
	
	
}


