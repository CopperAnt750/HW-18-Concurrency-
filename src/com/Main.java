package com;

public class Main {
    public static void main(String[] args) {
        EggClass EggClass = new EggClass();
        Thread eggThread = new Thread(EggClass);
        eggThread.start();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Chicken");
        }
        if (eggThread.isAlive()) {
            try {
                eggThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Egg was first");
        } else {
            System.out.println("Chicken was first");
        }
    }
}
