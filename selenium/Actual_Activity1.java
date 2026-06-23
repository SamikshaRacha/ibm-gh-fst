import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Actual_Activity1{
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://training-support.net/about/");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}	
}	


//OR WITHOUT NAVIGATION USE THE CLICK FUNTION

//System.out.println(driver.getTitle());
// Find the About Us link and click it 
//driver.findElement(By.linkText("About Us")).click(); - clicks on about us button 
// Print the page title of the About Us page
//System.out.println("New page title is: " + driver.getTitle());


