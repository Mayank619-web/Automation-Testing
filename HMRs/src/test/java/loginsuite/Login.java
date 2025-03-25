package loginsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	void testcase1(){
		//TODO Auto-generated method stub
		ChromeDriver bo=new ChromeDriver();
		bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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
	    if(actualresult.equals(expectedresult)) {
	    	System.out.println("Test case1 is passed");
	    } else {
	    	System.out.println("Test case1 is failed");
	    }
	    bo.quit();//close the browser
	}


	void testcase2() throws InterruptedException {
		//TODO Auto-generated method stub
		ChromeDriver bo=new ChromeDriver();
	    //get URL
	    bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
	    //maximize window
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
	    if(actualresult.equals(expectedresult)) {
	    	System.out.println("Test case2 is passed");
	    }else {
	    	System.out.println("Test case2 failed");
	    }
	    //close alert(pop)
	    bo.switchTo().alert().accept();
	    bo.quit();//close the browser
	}


	void testcase3() throws InterruptedException{
		//TODO Auto-generated method stub
		ChromeDriver bo=new ChromeDriver();
		//get URL
		bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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
	    if(actualresult.equals(expectedresult)) {
	    	System.out.println("Test case3 is passed");
	    } else {
	    	System.out.println("Test case3 is failed");
	    }
	    //close alert(pop)
	    bo.switchTo().alert().accept();
	    bo.quit();//close browser
	}
	void testcase4() throws InterruptedException{
		        // TODO Auto-generated method stub
				ChromeDriver bo=new ChromeDriver();
				//get URL
				bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
				//maximize window
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
		        if(actualresult.equals(expectedresult)) {
		        	System.out.println("Test case4 is passed");
		        } else {
		        	System.out.println("Test case4 is failed");
		        }
		        //close alert(pop)
		        bo.switchTo().alert().accept();
		        bo.quit();//close browser
	}


	void testcase5() throws InterruptedException{
		// TODO Auto-generated method stub
				ChromeDriver bo=new ChromeDriver();
				//get URL
				bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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
		        if(actualresult.equals(expectedresult)) {
		        	System.out.println("Test case5 is passed");
		        } else {
		        	System.out.println("Test case5 is failed");
		        }
		        //close alert(pop)
		        bo.switchTo().alert().accept();
		        bo.quit();//close browser
	}


	void testcase6() throws InterruptedException{
		// TODO Auto-generated method stub
				ChromeDriver bo=new ChromeDriver();
				//get URL
				bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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
		        if(actualresult.equals(expectedresult)) {
		        	System.out.println("Test case6 passed");
		        }else {
		        	System.out.println("Test case6 failed");
		        }
		        bo.quit();
	}
}
