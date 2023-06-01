package synchronization;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		LocalDateTime dateTime = LocalDateTime.now();
//		String timestamp = dateTime.toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement box = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		File temp = box.getScreenshotAs(OutputType.FILE);
		File dest = new File("./element/otp.png");
		FileUtils.copyFile(temp, dest);

	}

}
