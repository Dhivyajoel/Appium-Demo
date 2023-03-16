package com.simplilearn.AppiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Flipkart {
	
	private static final String SearchResult = null;
	AndroidDriver<MobileElement> driver;
	
	@BeforeTest
	public void launchApplication() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity", "com.flipkart.android.flip.FlipkartActivity");
		cap.setCapability("noReset", true); // do no rest the application every time it is launched
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	}
	
	
	@Test(priority=0)
	public Object verifyAdditionProcess() {
		
		String searchResult = getElement(By.xpath(SearchResult));
		searchResult.click();
		
	// Press Add to Cart
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		
		// Press Go to Cart
		driver.findElement(By.xpath("//android.widget.TextView[@text='GO TO CART']")).click();
		
		// Press Place Order
		driver.findElement(By.xpath("//android.widget.TextView[@text='PLACE ORDER']")).click();
		
		
		{
		return null;
	}
		String expectedResult = "Order Summary";
		String actualResult = driver.findElement(By.id("com.flipkart.android:id/result")).getText().substring(2, 4);
		
	}
	
	private String getElement(By xpath) {
		return null;
	}


	@AfterTest
	public void closeApp() {
		driver.quit();
		
	}
	
	}
	
	
	
		
		
