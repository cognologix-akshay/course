package com.test;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class automationAssignment {
    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("WebDriver.chrome.driver", "C:\\Driver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[@id='tabletsTxt']")).click();
        driver.findElement(By.id("17")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
        driver.findElement(By.id("checkOutPopUp")).click();
        driver.findElement(By.xpath("//input[@name='usernameInOrderPayment']")).sendKeys("akshay");
        driver.findElement(By.xpath("//input[@name='passwordInOrderPayment']")).sendKeys("Akshay1");
        driver.findElement(By.id("login_btnundefined")).click();
        driver.findElement(By.id("next_btn")).click();
        //driver.findElement(By.xpath("//input[@name='safepay_username']")).sendKeys("akshay");
        //driver.findElement(By.xpath("//input[@name='safepay_password']")).sendKeys("Akshay1");
        driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();




    }
}
