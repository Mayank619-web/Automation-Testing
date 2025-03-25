package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC00006 {

	public static void main(String[] args) throws InterruptedException {
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
