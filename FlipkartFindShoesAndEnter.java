package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartFindShoesAndEnter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Keys.ENTER");
		WebElement shoes = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[30]"));
		shoes.click();
		Set<String>selected_shoe=driver.getWindowHandles();
		System.out.println(selected_shoe);
		Iterator<String>pcid=selected_shoe.iterator();
		String pid=pcid.next();//parent id alone
		String cid=pcid.next();//child id alone
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		driver.close();
	}
}
