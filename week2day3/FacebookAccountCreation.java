package week2day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Sri");
			driver.findElement(By.name("lastname")).sendKeys("dharshith");
			driver.findElement(By.name("reg_email__")).sendKeys("8838563955");
			driver.findElement(By.id("password_step_input")).sendKeys("20015$");
			WebElement day = driver.findElement(By.name("birthday_day"));
			Select date = new Select(day);
			date.selectByIndex(20);
			WebElement mon = driver.findElement(By.name("birthday_month"));
			Select month = new Select(mon);
			month.selectByValue("6");
			WebElement year = driver.findElement(By.name("birthday_year"));
			Select yr = new Select(year);
			yr.selectByVisibleText("2015");
			//driver.findElement(By.name("websubmit")).click();
			WebElement gender = driver.findElement(By.className("_58mt"));
			gender.click();
			
		

		}

	}


