package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserlaunchselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

	}

}
