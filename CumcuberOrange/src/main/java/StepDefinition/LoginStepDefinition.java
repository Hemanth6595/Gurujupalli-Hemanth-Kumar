package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition
{
	WebDriver driver;
	String url=("https://opensource-demo.orangehrmlive.com/");
	
	@Given("^I was already in login page$")
	public void I_was_already_in_login_page()
	{
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
         driver=new ChromeDriver();
         driver.get(url);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
	}
	
	@Then("^I was enter \"(.*)\" and \"(.*)\"$")
	public void I_was_username_and_password(String username, String password)
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	       driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	      
	}
	@Then("^I was clicks on login button$")
	public void I_was_clicks_on_login_button()
	{
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
    }
	
	@Then("^I was in home page and check the page title$")
	public void I_was_in_home_page_and_check_the_page_title()
	{
	String title=driver.getTitle();
	System.out.print(title);
	Assert.assertEquals("OrangeHRM",title);
	}
	@Then("^I was click Admin$")
	public void I_was_click_Admin()
	{
		 driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	}
	
	@Then ("^I was close browser$")
	public void I_was_close_browser()
	{
		driver.close();
		
	}
}
