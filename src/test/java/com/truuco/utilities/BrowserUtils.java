package com.truuco.utilities;

import java.util.Set;

public class BrowserUtils {


    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }

    public static String linkcheck() {


        String currentWindow = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(currentWindow)) {
                Driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }


        String newWindowUrl = Driver.getDriver().getCurrentUrl();
        return newWindowUrl;
    }


}