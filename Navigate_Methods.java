package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//emty Browser
		//other than get() methods we launch the browser with the help of navigate().to(); method
		driver.navigate().to("https://www.google.com");
		//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		/*Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();*/
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
