package com.xworkz.xpathlocator;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        /*
         * xpath with single attribute
         */
        // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Shoes");

        /*
         * xpath with multiple attributes
         */
        // driver.findElement(By.xpath("//input[@name=\"search\"][@placeholder='Search']")).sendKeys("Tables");

        /*
         * xpath with 'and' 'or' operator
         */
        // driver.findElement(By.xpath("//*[@name='search' or @placeholder='abc']")).sendKeys("Lockers");
        // driver.findElement(By.xpath("//*[@placeholder='Search' and @name='search']")).sendKeys("Laptop Mouse");

        /*
         * xpath with text()  --> inner text
         */
        // driver.findElement(By.xpath("//a[text()='Software']")).click();

        boolean isDisplayed = driver.findElement(By.xpath("//h3[normalize-space()='Featured']")).isDisplayed();
        System.out.println(isDisplayed); //true

        String text = driver.findElement(By.xpath("//h3[normalize-space()='Featured']")).getText();
        System.out.println(text);   //Featured

        /*
         * xpath with contains(attribute, value)
         */
        // driver.findElement(By.xpath("//input[contains( @placeholder, 'ar')]")).sendKeys("Iron box");

        /*
         * xpath with starts-with(attribute, value)
         */
        driver.findElement(By.xpath("//input[starts-with( @placeholder, 'Sear')]")).sendKeys("Iron box");
        
        /*
         * chained xpath
         */
        boolean displayed = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(displayed);
    }
}
