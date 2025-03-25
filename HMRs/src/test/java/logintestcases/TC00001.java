package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC00001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver bo=new ChromeDriver();
		//get URL
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

}
