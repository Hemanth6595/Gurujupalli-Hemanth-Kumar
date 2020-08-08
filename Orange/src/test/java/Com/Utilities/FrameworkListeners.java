package Com.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class FrameworkListeners extends TestListenerAdapter

{
	public void onStart(ITestContext rv1)

    {                                                                             

System.out.println("---Batch Execution Started---");                                                

                  

}

    public void onFinish(ITestContext Result)                                                                            

        {                         

                    System.out.println("---Batch Execution Finish---");                          

        }         

    public void onTestStart(ITestResult Result)                                                                         

        {                         

                    System.out.println("---Test Script Execution Starts---");                                                 

        }         

    public void onTestSuccess(ITestResult Result)                                                                   

        {                         

                    System.out.println("---Test Script is passed and sucess and congrts--- :"+Result.getName());                   

        }         

    public void onTestFailure(ITestResult Result)                                                                     

        {

                    System.out.println("---Test Script is failed and try again.ScreenShot is taken with date--- :"+Result.getName());    

                    EventFiringWebDriver efw=new EventFiringWebDriver(CommonFile.driver);

                    File f1=efw.getScreenshotAs(OutputType.FILE);

                    String  date=new SimpleDateFormat("yyyyMMhhmmss").format(new Date());

                    String path=System.getProperty("user.dir")+"//screenshots//"+".jpg";

                    File f2=new File(path);

                    try {

                                    FileUtils.copyFile(f1,f2);

                    } catch (IOException e) {

                                    // TODO Auto-generated catch block

                                    e.printStackTrace();

                    }

        }         

    public void onTestSkipped(ITestResult Result)                                                                  

        {                         

        System.out.println("---Test Script is Skipped--- :"+Result.getName());                                                                  

        } 
	
}
