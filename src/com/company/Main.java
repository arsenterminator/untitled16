package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Mouse").print();


    }
    public static Animal createObject(String className){
        switch (className) {
            case "Dog":
                return new Dog("Borya",131);
            case "Cat":
                return new Cat("Shamil",34);
            case "Mouse":
                return new Mouse("Aybek",78);
            default:
                return null;
        }

    }
}
