package com.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.testcases.Base_Class;

public class Actions_class extends Base_Class {
    public String Action() throws AWTException, InterruptedException {
        Thread.sleep(3000);
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        return "Action performed successfully";
    }

}
