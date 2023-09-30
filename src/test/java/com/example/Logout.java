package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	
private WebDriver driver;
	
	
	public Logout(WebDriver driver) {
        this.driver = driver;
    }
	public void Logout_btns() throws InterruptedException {
		WebElement threed_button = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-header[1]/mat-toolbar[1]/button[11]/span[1]/mat-icon[1]"));
		threed_button.click();
		Thread.sleep(1000);
		WebElement Logout_button = driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[5]/mat-icon"));
		Logout_button.click();
    }
	
	

}
