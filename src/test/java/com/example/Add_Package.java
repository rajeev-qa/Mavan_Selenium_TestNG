package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Add_Package {
	
private WebDriver driver;
	
	
	public Add_Package(WebDriver driver) {
        this.driver = driver;
    }


	 //Click on package
	public void click_Package() {
		WebElement package_button = driver.findElement(By.cssSelector("body > app-root > app-sidenav > mat-sidenav-container > mat-sidenav-content > perfect-scrollbar > div > div.ps-content > div > app-home > div > div.row.count-card-wrapper > mat-card:nth-child(8) > p:nth-child(2) > span"));
        package_button.click();
    }
	
	//Click on Add
	public void add_button() {
        WebElement add = driver.findElement(By.xpath("/html/body/app-root/app-sidenav/mat-sidenav-container/mat-sidenav-content/app-header/mat-toolbar/button[2]/span[1]/mat-icon"));
        add.click();
    }
	
	//Enter name
	public void enter_name(String name) {
        WebElement nameField = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
        nameField.clear();
        nameField.sendKeys(name);
        
    }
	//Enter length
	public void enter_length(String length) {
        WebElement lengthField = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
        lengthField.clear();
        lengthField.sendKeys(length);
	
	}
	
	//select carrier Dropdown
	public void selects_carrier() {
	    WebElement dropdownElementcarrior = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/perfect-scrollbar[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[1]/section[2]/span[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")); 
	    dropdownElementcarrior.click();
	    WebElement selectelement = driver.findElement(By.xpath("//span[normalize-space()='Delhivery']")); 
	    selectelement.click();
	}
	
	//Enter Width
	public void enter_width(String width) {
        WebElement widthField = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/perfect-scrollbar[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/section[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"));
        widthField.clear();
        widthField.sendKeys(width);
	
	}
	
	//select type Dropdown
	public void selects_type() {
	    WebElement dropdownElementtype = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/perfect-scrollbar[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[1]/section[3]/span[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")); 
	    dropdownElementtype.click();
	    
	    WebElement selectelement = driver.findElement(By.xpath("//span[normalize-space()='Pak']")); 
	    selectelement.click();
	    
	    
	    
	}
	
	  //enter height
	public void enter_height(String height) {
        WebElement heightField = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/perfect-scrollbar[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/section[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"));
        heightField.clear();
        heightField.sendKeys(height);
	
	}
	
	 //check status
	public void check_status() {
        WebElement check = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/perfect-scrollbar[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[1]/section[4]/span[1]/mat-checkbox[1]/label[1]/span[1]"));
        check.click();
    }
	
	//Enter Location
	public void enter_location() {
        WebElement location = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/perfect-scrollbar[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/section[4]/span[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]"));
        location.click();
        WebElement checklocation = driver.findElement(By.xpath("//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted']"));
        checklocation.click();
        
        
    }
	
	
	
	public void submitForm() {
		WebElement conflocation = driver.findElement(By.xpath("/html/body/div[3]/div[1]"));
        conflocation.click();
        WebElement submitButton = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sidenav[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/perfect-scrollbar[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/app-package-type-manage[1]/mat-toolbar[1]/button[1]/span[1]/mat-icon[1]"));
        submitButton.click();
    }
	

}
