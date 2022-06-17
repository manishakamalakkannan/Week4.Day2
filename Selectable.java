package selenium.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 //Get URL
		 driver.get("http://www.leafground.com/pages/selectable.html");
		 //maximize
		 driver.manage().window().maximize();
		 //Click button to open home page in New Window
		WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement element3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		 Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(element1).click(element2).click(element3).keyUp(Keys.CONTROL).perform();
		driver.quit();
		
	}

}
