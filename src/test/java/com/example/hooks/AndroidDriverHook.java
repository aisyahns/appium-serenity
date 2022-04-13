package com.example.hooks;

import com.example.app.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHook {

    @Before
    public void before(){
        AndroidDriverInit.initialize();
    }

    @After
    public void after(){
        AndroidDriverInit.quit();
    }
}
