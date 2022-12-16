package Contact_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enquire_Now {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ditaxpresso.com/#/contactus");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Inquire Now ']")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
	} 

}
