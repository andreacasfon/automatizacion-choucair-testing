package com.Quality.prueba;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	private WebDriver driver;
	By capacidadLinkLocator = By.name("elementor-image-box-wrapper");
	By imag = By.id("1c3887a");
	By comoLoHacemosLinkLocator = By.id("hacemos");
	By portafolioLinkLocator = By.id("portafolio");
	By show = By.tagName("");
	By cookies = By.id("cookie_action_close_header");

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/servicio/");
	}

	@Test
	public void testCookies()  {
		driver.findElement(cookies).click();
		
	}
	
	@Test
	public void testCapacidad() throws InterruptedException {
		driver.findElement(capacidadLinkLocator).click();
		Thread.sleep(20000);
	}

	@Test
	public void testHacemos() throws InterruptedException {
		driver.findElement(comoLoHacemosLinkLocator).click();
		Thread.sleep(20000);
	}

	@Test
	public void testPortafolio() throws InterruptedException {
		driver.findElement(portafolioLinkLocator).click();
		Thread.sleep(20000);
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
