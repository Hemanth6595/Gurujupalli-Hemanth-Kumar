package Com.Utilities;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass
{
    public static Logger log;

    public static String username="Admin" ;

    public static String password="admin123";

    public static WebDriver driver;

    @BeforeTest

    public void openbrowser()

    {

                    log=Logger.getLogger(BaseClass.class);

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

    }

    @AfterTest

    public void closebrowser() throws InterruptedException

    {

                    Thread.sleep(3000);

                    driver.quit();

                    log.info("---Browser closed---");

    }

    @BeforeClass

    public void login() 

    {

    	
    	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
    	
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	    
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

                    log.info("---login sucessfully---");

    }

    @AfterClass

    public void logout() throws InterruptedException

    {

                    Thread.sleep(3000);

                    driver.findElement(By.xpath("//a[@id='welcome']")).click();
                    
           		 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

                    log.info("---logout sucessfully---");

    }



}
	
	
	
	
