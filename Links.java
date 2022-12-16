package Contact_Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ditaxpresso.com/#/contactus");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		for(WebElement getLinks:Links) {
			System.out.println(getLinks.getText() + "   " + getLinks.getAttribute("href"));
		}
		driver.quit();
	}

}
