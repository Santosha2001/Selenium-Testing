package com.xworkz;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

    public static void main(String[] args) {
        
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();    

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIds = driver.getWindowHandles();

        List<String> windowList=new ArrayList<>(windowIds);

        String parentId = windowList.get(0);
        String childId = windowList.get(1);

        // switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());


    }
}
