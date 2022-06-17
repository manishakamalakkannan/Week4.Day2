package selenium.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 //Get URL
		 driver.get("http://www.leafground.com/pages/sortable.html");
		 //maximize
		 driver.manage().window().maximize();
		 WebElement element = driver.findElement(By.xpath("//li[text()='Item 7']"));
		 WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(element, element2).perform();
		//driver.quit();
		 
	}

}
