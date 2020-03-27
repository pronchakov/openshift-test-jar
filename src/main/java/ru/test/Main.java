package ru.test;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println("Today is: " + new Date());
            Thread.sleep(1000);
        }
    }

}
