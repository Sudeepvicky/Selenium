package Selenium_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2317268\\Selenium\\Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://webapps.tekstac.com/FormRegistration/UserRegistration.html");
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='city']"));
		Select select = new Select(drop_down);
		List<WebElement> options = select.getOptions();
		for(WebElement i:options) {
			System.out.println(i.getText());
		}
		select.selectByVisibleText("New Delhi");
		driver.navigate().refresh();
		
	}
}
