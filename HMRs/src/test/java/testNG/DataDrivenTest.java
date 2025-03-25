package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataDrivenTest {
  @Test(dataProvider = "dp")
  public void testcase1(String ud, String psd) throws InterruptedException {
	  WebDriver bo=new ChromeDriver();
		bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		WebElement ud_txtfield=bo.findElement(By.xpath("//input[@name='id']"));
   	ud_txtfield.sendKeys(ud);
   	
   	WebElement psd_textfield=bo.findElement(By.xpath("//input[@name='pass']"));
   	psd_textfield.sendKeys(psd);
   	
   	WebElement lgn_button=bo.findElement(By.xpath("//input[@value='Login']"));
   	lgn_button.click();
   	String  actualresult=bo.getTitle();
   	String expectedresult="MainHMR";
   	Assert.assertEquals(actualresult, expectedresult);
   	Thread.sleep(3000);
   	bo.quit();
  }

  @DataProvider
  public Object[][] dp() {
	  Object[][] inputdata=new Object[4][2];
	    inputdata[0][0]="sadar";
	    inputdata[0][1]="sadar";
	    
	    inputdata[1][0]="sadar";
	    inputdata[1][1]="sadar";
	    
	    inputdata[2][0]="sadar";
	    inputdata[2][1]="sadar";
	    
	    inputdata[3][0]="sadar";
	    inputdata[3][1]="sadar";
	   return inputdata;
    
    
  }
}
