package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class VTigerCampaign {

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
		driver.findElement(By.xpath("//span[text()=' Campaigns']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("campaign");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
	}

}
