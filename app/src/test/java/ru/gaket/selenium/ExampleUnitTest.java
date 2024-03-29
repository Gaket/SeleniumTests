package ru.gaket.selenium;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

  @Test
  public void addition_isCorrect() throws InterruptedException {
    // Create a new instance of the Firefox driver
    WebDriver driver = new ChromeDriver();

    // An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time
    // when trying to find an element or elements if they are not immediately available.
    // The default setting is 0. Once set, the implicit wait is set for the life of the WebDriver object instance.
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Visit Google
    driver.get("http://www.google.com");

    // Check the title of the page
    System.out.println("Page title is: " + driver.getTitle());

    // Find the text input element by its name
    WebElement element = driver.findElement(By.name("q"));

    // Enter something to search for
    element.sendKeys("Selenium!");

    // Now submit the form. WebDriver will find the form for us from the element
    element.submit();

    //Close the browser
    driver.quit();
  }
}