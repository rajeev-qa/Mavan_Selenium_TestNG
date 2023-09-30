package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete_Package {
	private WebDriver driver;
	public Delete_Package(WebDriver driver) {
        this.driver = driver;
    }
	public void Delete_btns() throws InterruptedException {
		Thread.sleep(3000);
		WebElement delete_button = driver.findElement(By.cssSelector("body > app-root > app-sidenav > mat-sidenav-container > mat-sidenav-content > perfect-scrollbar > div > div.ps-content > div > app-dashboard > div > div.col-3 > app-package-type-list > perfect-scrollbar > div > div.ps-content > mat-card:nth-child(3) > div.padding.list-text"));
		delete_button.click();
		Thread.sleep(1000);
		
		WebElement deletes_button = driver.findElement(By.cssSelector("body > app-root > app-sidenav > mat-sidenav-container > mat-sidenav-content > perfect-scrollbar > div > div.ps-content > div > app-dashboard > div > div.col-3 > app-package-type-list > perfect-scrollbar > div > div.ps-content > mat-card:nth-child(3) > div.delete.ng-star-inserted > mat-icon"));
		deletes_button.click();
		Thread.sleep(1000);
		
		
		WebElement con_dlt_button = driver.findElement(By.cssSelector("#mat-dialog-0 > app-alert-dialog > mat-card > div > button > span.mat-button-wrapper"));
		con_dlt_button.click();
		Thread.sleep(1000);
    }
}
