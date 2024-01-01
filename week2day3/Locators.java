package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Load URL 
		driver.get("https://www.facebook.com/");
		//Enter E-mail by finding by id 
		WebElement email=driver.findElement(By.id("email")); 
		email.sendKeys("testleaf.2023@gmail.com");
		//Enter Password by finding by id 
		WebElement password=driver.findElement(By.id("pass")); 
		password.sendKeys("Tuna@321");
		//Click Login by name 
		WebElement login=driver.findElement(By.name("login")); 
		login.click();
		//Click on Find your account by name 
		WebElement find=driver.findElement(By.linkText("Find your account and log in.")); 
		find.click();
		//Verify the title page 
		String title=driver.getTitle();
		System.out.println(title); 
		if(title.contains("Forgotten Password")) 
		{
		System.out.println("Title is verified");
		}
		else
		{
		System.out.println("Invalid ID");
		}
	}

}
