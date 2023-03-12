package com.sda.springdemo;

public class DbRepository implements Repository{
    @Override
    public void read(){
        System.out.println("Read from Db");
    }
    @Override
    public void write(){
        System.out.println("Write into Db");
    }
}
