package com.xworkz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * ------------
 * 1. Launch Chrome browser
 * 2. open url: https://demo.opencart.com/
 * 3. validate title should be "Your Cart"
 * 4. close browser
 */

public class FirstTestCase {

    public static void main(String[] args) {

        System.out.println("Tesing..");

        // 1. Launch Chrome browser
        // ChromeDriver chromeDriver=new ChromeDriver();
        WebDriver webDriver = new ChromeDriver();

        // open url: https://demo.opencart.com/
        webDriver.get("https://demo.opencart.com/");

        // 3. validate title should be "Your Cart"
        String title = webDriver.getTitle();
        System.out.println(title.equals("Your Store") ? "Test Passed" : "Test failed");

        // 4. close browser
        // webDriver.close();
    }
}
