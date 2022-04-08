package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement slidebar = driver.findElement(By.xpath("//input[@type='range']"));
		
	//	WebElement dragPart = driver.findElement(By.id("draggable"));
		
	//	WebElement dropPart = driver.findElement(By.id("droppable"));
		
		Actions ac=new Actions(driver);
		
		ac.dragAndDropBy(slidebar, 50, 0).perform();
		
	//	ac.dragAndDrop(dragPart, dropPart).perform();
		
	//	ac.dragAndDropBy(dragPart, 50, 110).perform();
		
	//	ac.doubleClick(dragPart).dragAndDropBy(dragPart, 500, 400).build().perform();
		
		
	}

}
