package dataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriventesting {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//read file object
        FileInputStream file=new FileInputStream("C:\\Users\\mayan\\OneDrive\\Desktop\\Data.xlsx");
         //create workbook object
		 XSSFWorkbook wb=new XSSFWorkbook(file); 
      	 //get sheet in workbook
      	 XSSFSheet sh = wb.getSheet("Sheet1");
      	 //count no of rows
      	int rc=sh.getLastRowNum()-sh.getFirstRowNum();
      	//print no of rows
      	System.out.println(rc);
        
      	//loop for getting rows
      	for(int i=1;i<=rc;i++) {
      		WebDriver bo=new ChromeDriver();
      		bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
      		bo.manage().window().maximize();
  
      		System.out.println("Row"+i);
      		//get row in a sheet
      		XSSFRow rw=sh.getRow(i); 
         	 //get cell in row
         	 XSSFCell ud=rw.getCell(0); 
         	WebElement ud_txtfield=bo.findElement(By.xpath("//input[@name='id']"));
         	ud_txtfield.sendKeys(ud.toString());
         	 //print cell value
         	 System.out.println(ud);
         	XSSFCell psd=rw.getCell(1);
         	WebElement psd_textfield=bo.findElement(By.xpath("//input[@name='pass']"));
         	psd_textfield.sendKeys(psd.toString());
         	System.out.println(psd);
         	WebElement lgn_button=bo.findElement(By.xpath("//input[@value='Login']"));
         	lgn_button.click();
         	Thread.sleep(3000);
         	String  actualresult=bo.getTitle();
         	String expectedresult;
         	expectedresult="MainHMR";
         	if(actualresult.equals(expectedresult)) {
         		System.out.println("Test case passed");
         	}else {
         		System.out.println("Test case failed");
         	}
            bo.quit();
      	}
	}

}
