package com.investigation.java7.thread;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Process1("Process1"));
        thread1.start();
        thread1.join(); // espera a que este hilo termine para que se ejecute el siguiente

        Thread thread2 = new Thread(new Process2("Process2"));
        thread2.start();

        Thread.sleep(3000); // duerme por 3 segundos hasta que inicie el siguiente hilo

        Thread thread3 = new Thread(new Process2("Process3"));
        thread3.start();
    }
}