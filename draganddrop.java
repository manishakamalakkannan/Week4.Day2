package selenium.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 //Get URL
		 driver.get("http://www.leafground.com/pages/drag.html");
		 //maximize
		 driver.manage().window().maximize();
		 //Click button to open home page in New Window
		 WebElement element = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(element, 25, 25).perform();
		
	}

}
