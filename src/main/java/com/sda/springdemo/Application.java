package com.sda.springdemo;

public class Application {
   // private final FileRepository fileRepository = new FileRepository();
    private final DbRepository dbRepository = new DbRepository();

    public void start(){
        System.out.println("Start programu");
        dbRepository.read();
    }
    public void end(){
        System.out.println("Koniec programu");
        dbRepository.write();
    }
}
