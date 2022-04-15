package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class MyTaskPage extends BasePageObject {

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
        click(buttonAdd());
    }

    public void inputTaskTitle(){
        sendKeys(fieldTaskTitle(), "belajar");
    }

    public void inputTaskContent(){
        sendKeys(fieldTaskContent(), "belajar yok");
    }

    public void clickButtonSave(){
        System.out.println(find(buttonSave()).getCenter());
        System.out.println(find(buttonSave()).getCenter().getX() - 500);
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getSize().getHeight());
        System.out.println(driver.manage().window().getSize().getWidth());
        click(buttonSave());
    }

    public void verifyTaskTitleDisplayed(){
        Assertions.assertTrue(isDisplayed(taskTitle()));
    }

    public void verifyTaskTitleEqual(){
        Assertions.assertEquals("belajar", getText(taskTitle()));
    }
}
