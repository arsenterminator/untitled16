package com.company;

public class Dog  extends Animal{

    private int age;

    public Dog(String name, int age) {
        super(name);

        this.age = age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println("\n Name: " + getName() + "\n Age: " + getAge()
        );
    }
}

