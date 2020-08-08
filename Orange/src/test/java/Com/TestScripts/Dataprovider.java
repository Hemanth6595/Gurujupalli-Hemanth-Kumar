package Com.TestScripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	public static WebDriver driver;
	
	public static Logger log;

	@Test(dataProvider="testdata")
	public void login_logout(String username,String password)
	{
		log=Logger.getLogger(Dataprovider.class);
		 PropertyConfigurator.configure("Log4J.properties");
		 String browser="chrome";

         String url="https://opensource-demo.orangehrmlive.com/";

         if(browser.equals("chrome"))

         {

         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

         driver=new ChromeDriver();

         log.info("---Browser opend---");

         }

         else

         {

                         System.setProperty("webdriver.Firefox.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");

                         driver=new FirefoxDriver();

                         log.info("---Browser opend---");

         }
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    driver.close();
	    log.info("---Browser Closed---");
	}
	
	@DataProvider(name="testdata")
	public Object[][] datadriven()
	{
		Object[][]rv1=new Object[3][2];
		rv1[0][0]="Admin1";
		rv1[0][1]="admin2";
		rv1[1][0]="admin12";
		rv1[1][1]="admin12";
		rv1[2][0]="Admin";
		rv1[2][1]="admin123";
		
		return rv1;
	}
}
