//Constructor overloading
package com.gentech.inheritance;
class Animal {
    String name;
    int age;
    
    Animal() 
    {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Animal default constructor");
    }

    Animal(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Animal constructor with name called for " + name);
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor with name and age called for " + name + ", age " + age);
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    boolean hasFur;

    Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
        System.out.println("Mammal constructor called for " + name + ", age " + age + ", has fur: " + hasFur);
    }

    void breathe() {
        System.out.println(name + " is breathing.");
    }
}

class Dog extends Mammal {
    String breed;

    Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur); 
        this.breed = breed;
        System.out.println("Dog constructor called for " + name + ", age " + age + ", breed: " + breed);
    }
    void bark() {
        System.out.println(name + " is barking.");
    }
}
public class Assign5 {
	public static void main(String[] args) {
		 Dog dog = new Dog("Buddy", 5, true, "Golden Retriever");

	        dog.eat();   
	        dog.breathe(); 
	        dog.bark(); 

	}

}
