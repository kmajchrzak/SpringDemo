package com.sda.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//jak zrobić zapis, odczyt w bazie
@Primary
@Component("Db")
public class DbRepository implements Repository{

    public DbRepository() {
        System.out.println("DbRepository");
    }

    @Override
    public void read(){
        System.out.println("Read from Db");
    }
    @Override
    public void write(){
        System.out.println("Write into Db");
    }
}
