package selenium.program;


//import org.openqa.selenium.By;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunhBrowser {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver d1 = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//InternetExplorerDriver driver1 = new InternetExplorerDriver();
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get("https://www.google.com");
		//d1.get("https://www.Amazon.com");
		//d1.get("https://www.grotechminds.com/registration/");
		//System.out.println(d1.getTitle());	
		//d1.findElement(By.id("Username")).sendKeys("shyamala123");
		
		Thread.sleep(2000);
		//f1.close();
		f1.quit();
		}
}


