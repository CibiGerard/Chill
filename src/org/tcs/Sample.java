package org.tcs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akgra\\eclipse-workspace\\Screenshott\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		TakesScreenshot sc =(TakesScreenshot)driver;
		WebElement element = driver.findElement(By.id("email"));
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		
		File file =new File("C:\\Users\\akgra\\Pictures\\Screenshots\\output1.png");
		FileUtils.copyFile(screenshotAs, file);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
