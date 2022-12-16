package Contact_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_URLlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ditaxpresso.com/#/contactus");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("DITAxPresso")) {
			System.out.println("Test Case 01 is Pass");
		}
		else {
			System.out.println("Test case Failed");
		}
	}

}
