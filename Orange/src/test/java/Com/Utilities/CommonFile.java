package Com.Utilities;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CommonFile 
{
	static WebDriver driver;

    String path=(System.getProperty("user.dir")+"/Application.Properties");

              
@Test
               public void file() throws IOException

               {

                               System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

                               driver=new ChromeDriver();

                               FileInputStream fis=new FileInputStream(path);

                               Properties p1= new Properties();

                               p1.load(fis);

                               driver.get(p1.getProperty("Url"));

                               driver.manage().window().maximize();

                               driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                               driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(p1.getProperty("username"));
                    	       driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(p1.getProperty("password"));
                    	       driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
                    	       String Titile=driver.getTitle();
                    	       Assert.assertEquals("OrangeHRM",Titile );
                    	       driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
                    	       driver.findElement(By.xpath("//a[@id='welcome']")).click();
                    		   driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
                               driver.close();
             


               }

}

