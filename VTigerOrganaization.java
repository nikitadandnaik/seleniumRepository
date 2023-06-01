package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class VTigerOrganaization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");                                                                                                   
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
		Thread.sleep(2000);
		WebElement marketing=driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions a=new Actions(driver);
		a.moveToElement(marketing).perform();
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Nikita Dandnaik");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7020027010");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("53453");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("7218890067");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("dandnaiknikita2000@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("hshdyfxm");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("gdhg5646kh");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("53445");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.letcode.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("smiley");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("70200");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("dandnaiknikita@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("bill_street")).sendKeys("Deccan,pune");
		Thread.sleep(2000);
		driver.findElement(By.name("ship_street")).sendKeys("Deccan,pune");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("Deccan");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("Deccan");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("413502");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("413502");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.id("description")).sendKeys("Thank you for accepting!!!!!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
