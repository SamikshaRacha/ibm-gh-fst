import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Challenge_Activity1{
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		
		String getId = element.getAttribute("id");
		String classname = element.getAttribute("Class");
		String name = element.getAttribute("Name");
		
		System.out.println(getId);
		System.out.println(classname);
		System.out.println(name);

		
		driver.quit();
		
	}
}