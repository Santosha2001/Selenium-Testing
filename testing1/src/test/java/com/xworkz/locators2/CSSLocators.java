package com.xworkz.locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

    public static void main(String[] args) {

        // 1. Launch Chrome browser
        // ChromeDriver chromeDriver=new ChromeDriver();
        WebDriver webDriver = new ChromeDriver();

        // open url: https://demo.opencart.com/
        webDriver.get("https://demo.nopcommerce.com/");

        webDriver.manage().window().maximize();

        // tag name is optional
        // tag id
        // webDriver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");

        // tag class 
        // webDriver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mobile");

        // tag attribute
        // webDriver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Shoes");

        // tag class and attribute
        webDriver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("T-Shirts");
    }
}
