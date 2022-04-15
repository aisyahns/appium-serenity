package com.example.app.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class MyTaskPage {

    By buttonAdd(){
        return By.id("fabMain");
    }

    By fieldTaskTitle(){
        return By.id("editTextTaskTitle");
    }

    By fieldTaskContent(){
        return By.id("editTextTaskContent");
    }

    By buttonSave(){
        return By.id("buttonApply");
    }

    By taskTitle(){
        return By.id("textViewTaskTitle");
    }

    public void clickButtonAdd(){
        AndroidElement buttonAdd = driver.findElement(buttonAdd());
        buttonAdd.click();
    }

    public void inputTaskTitle(){
        AndroidElement fieldTaskTitle = driver.findElement(fieldTaskTitle());
        fieldTaskTitle.sendKeys("belajar");
    }

    public void inputTaskContent(){
        AndroidElement fieldTaskContent = driver.findElement(fieldTaskContent());
        fieldTaskContent.sendKeys("belajar yok");
    }

    public void clickButtonSave(){
        AndroidElement buttonSave = driver.findElement(buttonSave());
        buttonSave.click();
    }

    public void verifyTaskTitleDisplayed(){
        AndroidElement taskTitle = driver.findElement(taskTitle());
        Assertions.assertTrue(taskTitle.isDisplayed());
    }

    public void verifyTaskTitleEqual(){
        AndroidElement taskTitle = driver.findElement(taskTitle());
        Assertions.assertEquals("belajar", taskTitle.getText());
    }
}
