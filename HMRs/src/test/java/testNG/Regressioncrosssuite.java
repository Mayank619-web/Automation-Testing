package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Regressioncrosssuite {
	WebDriver bo;
	String builpath="https://bsadar.github.io/hmrbuild1/Loging.html";
  
  @BeforeMethod
  public void buildexecute() {
		   bo=new ChromeDriver();
		   //bo=new FirefoxDriver();
		   //bo=new EdgeDriver();
			bo.get(builpath);
  }

  @AfterMethod
  public void afterMethod() {
	  bo.quit();//close the browser
  }
  @Test(description="valid functionality of login button",enabled=true,priority=1,groups="login")
  public void testcase1() {
	  
		//maximize window
		bo.manage().window().maximize();
	    //valid usr_id text field
		WebElement usr_id=bo.findElement(By.xpath("//input[@name='id']"));
		usr_id.sendKeys("sadar");
		//valid  Password text field
	    WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
	    pd.sendKeys("sadar");
	    //Click on login button
	    WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
	    lgn.click();
	    //getTitle
	    String  actualresult=bo.getTitle();
	    System.out.println(actualresult);
	    //ExpectedResult
	    String expectedresult;
	    expectedresult="MainHMR";
	    
	    //print test case passed/failed
	    Assert.assertEquals(actualresult, expectedresult);
	    
	    
  }
  @Test(enabled=true,priority=2,groups="login")
  void testcase2() throws InterruptedException {
	  bo.manage().window().maximize();
	    //sleep method
	    Thread.sleep(4000);
	    //Valid user_id text field
	    WebElement usr_id=bo.findElement(By.cssSelector("input[name='id']"));
	    usr_id.sendKeys("sadar");
	    //Invalid password text field using try,catch and finally
	    WebElement ipd=bo.findElement(By.cssSelector("input[name='pass']"));
	    ipd.sendKeys("admi12");
	    //Click on login button
	    WebElement lgn=bo.findElement(By.cssSelector("input[value='Login']"));
	    lgn.click();
	    //getText
	    String  actualresult=bo.switchTo().alert().getText();
	    System.out.println(actualresult);
	    //ExpectedResult
	    String expectedresult;
	    expectedresult="Invalid Password";
	    //Test case passed/failed
	    Assert.assertEquals(actualresult, expectedresult);
	    	    //close alert(pop)
	    bo.switchTo().alert().accept();
}
  @Test(enabled=true,priority=3,groups="login")
  void testcase3() throws InterruptedException {
	//maximize window
			bo.manage().window().maximize();
			//sleep method 
			Thread.sleep(4000);
			//Invalid usr_id text field 
			WebElement usr_id=bo.findElement(By.cssSelector("input[name='id']"));
			usr_id.sendKeys("ads");
			//valid  Password text field
		    WebElement pd=bo.findElement(By.cssSelector("input[name='pass']"));
		    pd.sendKeys("sadar");
		    //Click on login button
		    WebElement lgn=bo.findElement(By.cssSelector("input[value='Login']"));
		    lgn.click();
		    //getText
		    String actualresult=bo.switchTo().alert().getText();
		    System.out.println(actualresult);
		    //Expected result
		    String expectedresult;
		    expectedresult="Invalid UserID";
		    //Test case passed/failed
		    Assert.assertEquals(actualresult, expectedresult);
		    
		    //close alert(pop)
		    bo.switchTo().alert().accept();
  }
  @Test(enabled=true,priority=4,groups="login")
  void testcase4() throws InterruptedException {
	  bo.manage().window().maximize();
		//sleep method 
		Thread.sleep(4000);
		//Invalid usr_id text field
		WebElement usr_id=bo.findElement(By.xpath("//input[@name='id']"));
		usr_id.sendKeys("2345");
		//Invalid  Password text field
    WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
    pd.sendKeys("admi@12");
    //Click on login button
    WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
    lgn.click();
    //getText
    String actualresult=bo.switchTo().alert().getText();
    System.out.println(actualresult);
    //ExpectedResult
    String expectedresult;
    expectedresult="Invalid UserID";
    //Test case passed/failed
    Assert.assertEquals(actualresult, expectedresult);
    
    //close alert(pop)
    bo.switchTo().alert().accept();
  }
  @Test(enabled=true,priority=5,groups="login")
  void testcase5() throws InterruptedException{
	//maximize window
			bo.manage().window().maximize();
			//sleep method 
			Thread.sleep(4000);
			//blank usr_id text field
			WebElement usr_id=bo.findElement(By.xpath("//input[@name='id']"));
			usr_id.sendKeys("");
			//blank  Password text field
	      WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
	      pd.sendKeys("");
	      //Click on login button
	      WebElement lgn=bo.findElement(By.xpath("//input[@value='Login']"));
	      lgn.click();
	      //getText
	      String actualresult=bo.switchTo().alert().getText();
	      System.out.println(actualresult);
	      //ExpectedResult
	      String expectedresult;
	      expectedresult="Invalid UserID";
	      //Test case passed/failed
	      Assert.assertEquals(actualresult, expectedresult);
	      
	      //close alert(pop)
	      bo.switchTo().alert().accept();
  }
  @Test(enabled=true,priority=6,groups="Reset")
  void testcase6() throws InterruptedException{
	//maximize window
			bo.manage().window().maximize();
			//sleep method 
			Thread.sleep(4000);
			//Valid usr_id text field
			WebElement usr_id=bo.findElement(By.xpath("//input[@name='id']"));
			usr_id.sendKeys("sadar");
			//Valid  Password text field
	      WebElement pd=bo.findElement(By.xpath("//input[@name='pass']"));
	      pd.sendKeys("sadar");
	      WebElement reset=bo.findElement(By.xpath("//input[@type='Reset']"));
	      reset.click();
	      String actualresult=usr_id.getText();
	      System.out.println(actualresult);
	      String expectedresult;
	      expectedresult="";
	      //Test case passed/failed
	      Assert.assertEquals(actualresult, expectedresult);
  }
  @Test(enabled=true,priority=7,groups="link")
  void testcase7(){
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
  }
  @Test(enabled=true,priority=8,groups="link")
  void testcase8() throws InterruptedException{
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
  }
  @Test(enabled=true,priority=9,groups="link")
  void testcase9() throws InterruptedException{
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
  }
  @Test(description="valid functionality of Logout link",enabled=true,priority=10,groups="link")
  void testcase10() throws InterruptedException{
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
  }

}
