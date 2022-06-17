package selenium.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragtoDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 //Get URL
		 driver.get("http://www.leafground.com/pages/drop.html");
		 //maximize
		 driver.manage().window().maximize();
		 //Click button to open home page in New Window
		 WebElement element = driver.findElement(By.id("draggable"));
		 WebElement element2 = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(element, element2).perform();
		driver.quit();
	
	}

}
