package com.gentech.polymorphism;
class Animal 
{
    void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal 
{   
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal 
{   
    void sound() 
    {
        System.out.println("Cat meows");
    }
}


public class  Assign1{

	public static void main(String[] args) {
		Animal a=new Animal();
		a.sound();
		
		Dog d = new Dog(); 
        Cat c =new Cat(); 
        
        a=c;
        a.sound();
        
        a=d;
        a.sound();

       
	}

}

