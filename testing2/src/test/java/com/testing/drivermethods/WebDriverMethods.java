package com.testing.drivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        // getTitle() --> returns the title of the web page
        System.out.println(driver.getTitle());

        // getCurrentUrl() --> returns url of the page.
        System.out.println(driver.getCurrentUrl());

        // getPageSource() --> returns source code of the page.
        System.out.println(driver.getPageSource());

        // getWindowhandle() --> returns the ID of the single browser window.
        System.out.println(driver.getWindowHandle());

        // getWindowHandles() --> returns the ID of all the browser windows.
        // driver.findElement(By.linkText("OrangeHRm, Inc")).click();
        // Set<String> windowHandles = driver.getWindowHandles();
        // System.out.println(windowHandles);

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
    }
}
