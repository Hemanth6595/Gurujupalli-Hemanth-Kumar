package Com.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.Utilities.BaseClass;

public class LoginTest extends BaseClass
{

	@Test
	public void sucess()
	{
		 driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	}
	
	
}
