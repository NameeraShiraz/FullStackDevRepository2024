//Same variable

package com.gentech.inheritance;
class Product 
{
    double price;

    Product(double price) 
    {
        this.price = price;
    }
    void dispbase(double price)
    {
    	System.out.print("Gadget price :"+price);
    }
}

class Electronics extends Product 
{
    double price;

    Electronics(double Price, double electronicsPrice) 
    {
        super(Price);
        this.price = electronicsPrice;
    }
}

class Phone extends Electronics 
{
    double price;

    Phone(double Price, double electronicsPrice, double phonePrice) 
    {
        super(Price, electronicsPrice); 
        this.price = phonePrice;
    }

    void displayPrices() 
    {
        System.out.println( "\nElectronics price: " + super.price +"\nPhone price: " + price);
    }
}

public class Assign8 {
	public static void main(String[] args) {
		  Phone myPhone = new Phone(300.0, 500.0, 800.0);
		  myPhone.dispbase(300.0);
	      myPhone.displayPrices();

	}

}
