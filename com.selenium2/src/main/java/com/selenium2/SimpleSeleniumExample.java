package com.selenium2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleSeleniumExample {
	public static void main(String[] args) {
        // Set the path to the ChromeDriver (if not using system PATH)
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Biswajit Bhadra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver (Chrome)
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google's homepage
            driver.get("https://www.google.com");

            // Find the search box element by its name
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type "Selenium WebDriver" in the search box
            searchBox.sendKeys("Selenium WebDriver");

            // Submit the search form
            searchBox.submit();

            // Wait for the results page to load and display the title
            Thread.sleep(2000); // Simple sleep, ideally use WebDriverWait

            // Print the title of the current page
            System.out.println("Page title is: " + driver.getTitle());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

