package com.scaler;

public class main {
    public static void main(String[] args){
        System.out.println("Hello world");
        Person p = Person.builder().age(25).name("John Doe").build();
        System.out.println(p.toString());
    }

}
