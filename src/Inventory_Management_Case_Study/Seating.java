package Inventory_Management_Case_Study;

import java.util.Scanner;

public class Seating extends Furniture {
    private int loadCapacity;

    public Seating(String name, double price, int stock_quantity, int taxation_specifics, String productID, String material, String dimensions, int loadCapacity) {
        super(name, price, stock_quantity, taxation_specifics, productID, material, dimensions);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nloadCapacity: " + loadCapacity
                ;
    }

    public void updateloadcapacity(){
        System.out.println("enter the new load capacity:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getLoadCapacity()==id)
                break;
        }
        products[i].setLoadCapacity(id);
    }
}
