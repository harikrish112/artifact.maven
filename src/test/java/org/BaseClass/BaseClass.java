package org.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions actions;
	public static Robot r;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void toTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void fill(WebElement element, String usertxt) {
		element.sendKeys(usertxt);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static String toAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void toPerformMoveToElements(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public static void toPerformDoubleClick(WebElement element) {
		actions.doubleClick(element).perform();

	}

	public static void toPerformDragAndDrop(WebElement src, WebElement dest) {
		actions.dragAndDrop(src, dest);
	}

	public static void toPerformEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toPerformTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
}
