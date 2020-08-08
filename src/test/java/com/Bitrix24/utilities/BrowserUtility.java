package com.Bitrix24.utilities;

public class BrowserUtility {
    public static void waitfor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
