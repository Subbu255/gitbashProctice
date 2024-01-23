package com.parallelSuiteExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowser {


    @Test
    public void openBrowser(){

//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("http:www.google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }

}
