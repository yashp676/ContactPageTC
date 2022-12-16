package Contact_Page;


import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ditaxpresso.com/#/contactus");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("First Name")).sendKeys("Sachin");
		driver.findElement(By.name("Last Name")).sendKeys("Kumar");
		WebElement drop = driver.findElement(By.name("CONTACTCF2"));
		Select s = new Select(drop);
		s.selectByVisibleText("India (+91)");
		
		driver.findElement(By.name("Phone")).sendKeys("1234567890");
		driver.findElement(By.name("Email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("Title")).sendKeys("Testing");
		driver.findElement(By.name("Description")).sendKeys("Testing...........");
	  driver.findElement(By.xpath("//input[@class='site-button button-lg']")).click();
	   
		
	}

}
