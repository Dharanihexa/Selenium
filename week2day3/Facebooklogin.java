package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/"); 
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("email")); 
		userName.sendKeys("testleaf.2023@gmail.com");
		WebElement password = driver.findElement(By.id("pass")); 
		password.sendKeys("Tuna@321");
		driver.findElement(By.id("loginbutton")).click();
		String title = driver.getTitle();
		if (title.contains("Log in to Facebook")) 
		{ 
			System.out.println("Login Successful");
		} 
		else 
		{
		System.out.println("Login failed");
		}
		}
	}

