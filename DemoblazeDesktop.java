package demoblaze;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DemoblazePage;
import pages.TestCaseScreenShot;
import testcases.ReadExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pages.TestCaseScreenShot;
public class DemoblazeDesktop extends DemoblazePage {
	WebDriver w;
	int i=1;
	TestCaseScreenShot ts;
	public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public static DataFormatter formatter= new DataFormatter();
    //public static String file_location = System.getProperty("user.dir")+"\\src\\main\\java\\com\\productconfigurator\\Util\\OPFDetails.xlsx";
    static String SheetName= "demoblaze mobile";
    DemoblazePage dbz;
   // dec 18 2023
	@BeforeMethod
	public void getscreen()
	{
		System.out.println(System.getProperty("user.dir"));
		WebDriverManager.chromedriver().setup();
		ts=new TestCaseScreenShot();
		
	}
	
  @Test(dataProvider = "dp",enabled=true)
  public void mobileautomate(String tid,String us,String pw,String samsg6,String nokl,String nx,String samsg7,String htc,String exe) throws InterruptedException {
	  if(!(tid.equals("test id"))&&exe.equals("yes"))
	  {
	//  System.setProperty("webdriver.chrome.driver", "D:\\data\\st\\chromedriver.exe");
		  w=new ChromeDriver();
	w.manage().window().maximize();
	DemoblazePageURL(w,"https://www.demoblaze.com/index.html");
	//dbz=new DemoblazePage(w,"https://www.demoblaze.com/index.html");
	UserLogin_withoutUserType(us,pw);
	/*  w.get("https://www.demoblaze.com/index.html");
	  Reporter.log("opened demoblaze site");
	  w.findElement(By.linkText("Log in")).click();
	try {
		Thread.sleep(3000);
	
	  w.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(us);
	  Reporter.log("entered user name");
	  w.findElement(By.id("loginpassword")).sendKeys(pw);
	  Reporter.log("entered user password");
	  
			  w.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
			  Reporter.log("logged in");
				Thread.sleep(3000);*/
				if(samsg6.equals("yes"))
				{
			 /* w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(3000);
			  w.findElement(By.linkText("Samsung galaxy s6")).click();
			  
			  Thread.sleep(3000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			 
			  Alert alert = w.switchTo().alert();
			  
              alert.accept();
              ts.takePageScreenshot(w,"Samsung galaxy s6");
              Thread.sleep(1000);
              Reporter.log("added Samsung galaxy s6 to cart");
              
			  w.findElement(By.partialLinkText("Home")).click();
			  Thread.sleep(2000);*/
					selectmobile("Samsung galaxy s6",tid);
					//addtocart();
				}
				if(nokl.equals("yes"))
				{
			 /* w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(3000);
			  w.findElement(By.linkText("Nokia lumia 1520")).click();
			  Thread.sleep(2000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			 
			  Alert alert = w.switchTo().alert();
			 
              alert.accept();
              ts.takePageScreenshot(w,"Nokia lumia 1520");
              Thread.sleep(1000);
              Reporter.log("added Nokia lumia 1520 to cart");
              
			  w.findElement(By.partialLinkText("Home")).click();
			  Thread.sleep(2000);*/
					selectmobile("Nokia lumia 1520",tid);
					//addtocart();
				}
				if(nx.equals("yes"))
				{
			  /*w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(3000);
			  w.findElement(By.linkText("Nexus 6")).click();
			  Thread.sleep(2000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			 
			  Alert alert = w.switchTo().alert();
              alert.accept();
              ts.takePageScreenshot(w,"Nexus 6");
              Thread.sleep(1000);
              Reporter.log("added Nexus 6 to cart");
			  w.findElement(By.partialLinkText("Home")).click();
			  Thread.sleep(2000);*/
					selectmobile("Nexus 6",tid);
					//addtocart();
				}
				//Samsung galaxy s7
				if(samsg7.equals("yes"))
				{
			 /* w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(3000);
			  w.findElement(By.linkText("Samsung galaxy s7")).click();
			  Thread.sleep(2000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			 
			  Alert alert = w.switchTo().alert();
              alert.accept();
              ts.takePageScreenshot(w,"Samsung galaxy s7");
              Thread.sleep(1000);
              Reporter.log("added Samsung galaxy s7 to cart");
			  w.findElement(By.partialLinkText("Home")).click();
			  Thread.sleep(2000);*/
					selectmobile("Samsung galaxy s7",tid);
				}
				
				//htc
				if(htc.equals("yes"))
				{
			/* w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(3000);
			  w.findElement(By.linkText("HTC One M9")).click();
			  Thread.sleep(2000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			 
			  Alert alert = w.switchTo().alert();
              alert.accept();
              ts.takePageScreenshot(w,"HTC One M9");
              Thread.sleep(1000);
              Reporter.log("added htc one to cart");
			  w.findElement(By.partialLinkText("Home")).click();
			  Thread.sleep(2000);
			  */
					selectmobile("HTC One M9",tid);
				}
				Thread.sleep(2000);
			 showcart(tid);
	
	  }
  }
  @AfterMethod
  public void closebrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  w.close();
	  
  }

  @DataProvider
  public Object[][] dp() throws IOException {
//ReadExcelFile config = new ReadExcelFile("./Test Data Excel/testcase.xlsx");
FileInputStream fileInputStream= new FileInputStream("./Test Data Excel/testcase.xlsx"); //Excel sheet file location get mentioned here
workbook = new XSSFWorkbook (fileInputStream); //get my workbook 
worksheet=workbook.getSheet(SheetName);// get my sheet from workbook
XSSFRow Row=worksheet.getRow(0);     //get my Row which start from 0   

int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
int ColNum= Row.getLastCellNum(); // get last ColNum 

System.out.println("Total number of rows:" +RowNum);
 
Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
 
    for(int i=0; i<RowNum-1; i++) //Loop work for Rows
    {  
        XSSFRow row= worksheet.getRow(i+1);
         
        for (int j=0; j<ColNum; j++) //Loop work for colNum
        {
            if(row==null)
                Data[i][j]= "";
            else
            {
                XSSFCell cell= row.getCell(j);
                if(cell==null)
                    Data[i][j]= ""; //if it get Null value it pass no data 
                else
                {
                    String value=formatter.formatCellValue(cell);
                    Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                }
            }
        }
    }

return Data;
  }
}
