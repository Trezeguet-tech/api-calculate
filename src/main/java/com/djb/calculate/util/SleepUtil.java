package com.djb.calculate.util;

public class SleepUtil {

    public static void sleepSeconds(int seconds)  {
        try{
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
