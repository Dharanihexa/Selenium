package week1day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser open = new Browser();
		open.launchBrowser("Edge");
		open.loadUrl();
	}
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		
		return (browserName);
	}
	
	public void loadUrl()
		{
		System.out.println("Application url loaded successfully");
		System.out.println("---------Assignment 2--------");
		}

  
  
  
}
