package com.xworkz.locators1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

    public static void main(String[] args) {

        // 1. launch browser
        WebDriver driver = new ChromeDriver();

        // 2. open browser
        driver.get("https://demo.opencart.com/");

        // To Maximize the window.
        driver.manage().window().maximize();

        // name
        driver.findElement(By.name("search")).sendKeys("Mac");

        // id
        boolean isLogoDisplayed = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(isLogoDisplayed);

        // linktext
        // driver.findElement(By.linkText("Tablets")).click();

        // partial link text
        // driver.findElement(By.partialLinkText("Soft")).click();

        // className
        List<WebElement> classElements = driver.findElements(By.className("list-inline-item"));
        classElements.forEach(a -> System.out.println(a));
        System.out.println("Size of the class name: " + classElements.size());

        // tagName
        List<WebElement> tagElements = driver.findElements(By.tagName("a"));
        tagElements.forEach(a -> System.out.println(a));
        System.out.println("Size of the tag name: " + tagElements.size());

    }
}
