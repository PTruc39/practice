package com.tutorialsninja.automation.base;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import com.tutorialsninja.automation.config.ConfigurationReader;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.util.PathHelper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Base {
	
	public static Logger log=Logger.getLogger(Base.class);
	
	public static WebDriver driver;
	public static ConfigurationReader reader;
	
	
	
	
	
	@Before
	public void setUp(Scenario scenario){
		log.info("Scenario Started: "+scenario.getName());
		PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		reader=new PropertyFileReader();
		Browser.startBrowser();
		Browser.maximize();
	}

//	@After
//	public void closeBrowser(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// Chụp ảnh màn hình và chuyển đổi nó thành mảng byte[]
//			byte[] screenshot = Browser.takeScreenshot();
//			// Thêm ảnh chụp màn hình vào báo cáo
//			scenario.embed(screenshot, "image/png");
//		}
//		log.info("Scenario Completed: " + scenario.getName());
//		log.info("Scenario Status is: " + scenario.getStatus());
//		Base.driver.quit();
//	}
}


