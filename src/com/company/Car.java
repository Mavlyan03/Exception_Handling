package com.company;

public class Car implements AutoCloseable {
    public void drive()  {
        System.out.println("The car start to driving");
    }
    @Override
    public void close() {
        System.out.println("The car  stopped");
    }

}
