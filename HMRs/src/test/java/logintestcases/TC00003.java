package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC00003 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

}
