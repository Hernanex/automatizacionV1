package com.enviopack.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerSafari implements IDriverManager {

	@Override
	public WebDriver createDriver() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		return driver;
	}


}
