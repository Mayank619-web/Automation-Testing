package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainHMRlinktest {
  @Test
  public void testscenario03() {
	// TODO Auto-generated method stub
      ChromeDriver bo=new ChromeDriver();
      //get method
      bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
      bo.manage().window().maximize();//to maximize window
      //user-id text field
      WebElement usrid=bo.findElement(By.xpath("//input[@name='id']"));
      usrid.sendKeys("sadar");
      //password text field
      WebElement  psd=bo.findElement(By.xpath("//input[@name='pass']"));
      psd.sendKeys("sadar");
      //login button
      WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
      lgn.click();
      //Stations Halts to monitor link
      WebElement lnk=bo.findElement(By.xpath("//b[normalize-space()='Station Halts to monitor']"));
      lnk.click();
      //actual-result
	    String  actualresult=bo.getTitle();
	    System.out.println(actualresult);
	    //expected-result
	    String expectedresult;
	    expectedresult="stations";
	    //Using assert 
	    Assert.assertEquals(actualresult, expectedresult);
	    bo.quit();//close browser
}
	@Test
	void testscenario04() throws InterruptedException{
		ChromeDriver bo=new ChromeDriver();
	    bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	    bo.manage().window().maximize();//To maximize window
	    Thread.sleep(4000);
	    bo.navigate().refresh();
	    
	    //User-id text field
	    WebElement user_id=bo.findElement(By.xpath("//input[@name='id']"));
	    user_id.sendKeys("sadar");
	    //password text field
	    WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
	    pd.sendKeys("sadar");
	    
	    //login button
	    WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
	    lgn.click();
	    Thread.sleep(4000);
	    //Update profile&Skills link
	    WebElement upd=bo.findElement(By.xpath("//b[normalize-space()='Update Profile&Skills']"));
	    upd.click();
	    //actaual-result
	    String actualresult=bo.getTitle();
	    System.out.println(actualresult);
	    //expected-result
	    String expectedresult;
	    expectedresult="AplHmr";
	    //Using assert
	    Assert.assertEquals(actualresult, expectedresult);
	    bo.quit();//closing browser
	}
	@Test
	void testscenario05() throws InterruptedException{
		ChromeDriver bo=new ChromeDriver();
	    bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	    bo.manage().window().maximize();//To maximize window
	    Thread.sleep(4000);
	    bo.navigate().refresh();
	    
	    //User-id text field
	    WebElement user_id=bo.findElement(By.xpath("//input[@name='id']"));
	    user_id.sendKeys("sadar");
	    //password text field
	    WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
	    pd.sendKeys("sadar");
	    
	    //login button
	    WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
	    lgn.click();
	    Thread.sleep(4000);
	    //Update Address link
	    WebElement adrs=bo.findElement(By.xpath("//b[normalize-space()='Update Address']"));
	    adrs.click();
	    //actual-result
	    String actualresult=bo.getTitle();
	    System.out.println(actualresult);
	    //expected-result
	    String expectedresult;
	    expectedresult="Page not found · GitHub Pages";
	    //Using assert to Test case passed/failed
	    Assert.assertEquals(actualresult, expectedresult);
	    bo.quit();//closing browser
	}
	@Test
	void testsceanrio06() throws InterruptedException{
		ChromeDriver bo=new ChromeDriver();
	    bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	    bo.manage().window().maximize();//To maximize window
	    Thread.sleep(4000);
	    bo.navigate().refresh();
	    
	    //User-id text field
	    WebElement user_id=bo.findElement(By.xpath("//input[@name='id']"));
	    user_id.sendKeys("sadar");
	    //password text field
	    WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
	    pd.sendKeys("sadar");
	    
	    //login button
	    WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
	    lgn.click();
	    Thread.sleep(4000);
	    //Logout
	    bo.findElement(By.xpath("//font[normalize-space()='Logout']")).click();
	    //actual-result
	    String  actualresult=bo.getTitle();
	    System.out.println(actualresult);
	    //expected-result
	    String  expectedresult;
	    expectedresult="HMR";
	    //Using assert Test case passed/failed
	    Assert.assertEquals(actualresult, expectedresult);
	    bo.quit();//closing browser
	}
}
