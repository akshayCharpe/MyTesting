package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PracticePage 
{

	@FindBy(id = "dropdown-class-example")private WebElement listBox;
	
	public PracticePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void listBoxValue() throws InterruptedException
	{
		Select s=new Select(listBox);
		s.selectByIndex(2);
		Thread.sleep(3000);
		
	}
}
