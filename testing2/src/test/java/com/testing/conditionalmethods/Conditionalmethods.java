package com.testing.conditionalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register"); 

        driver.manage().window().maximize();

        boolean displayed = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(displayed);

        boolean enabled = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println(enabled);

        boolean selected = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
        System.out.println(selected);

        Thread.sleep(5000);
        
        driver.close();
    }
}
