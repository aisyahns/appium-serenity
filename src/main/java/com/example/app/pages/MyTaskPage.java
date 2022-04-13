package com.example.app.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class MyTaskPage {

    By buttonAdd(){
//        return MobileBy.AccessibilityId("");
        return By.id("");
    }

    public void clickButtonAdd(){
        AndroidElement buttonAdd = driver.findElement(buttonAdd());
        buttonAdd.click();
    }

}
