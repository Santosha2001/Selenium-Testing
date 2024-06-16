package com.xworkz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // driver.get("https://demo.nopcommerce.com/");

        // navigate.to()
        // internally calling get()
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://google.com");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
