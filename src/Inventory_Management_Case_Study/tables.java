package Inventory_Management_Case_Study;

import java.util.Scanner;

public class tables extends Furniture{
    private String shape;

    public tables(String name, double price, int stock_quantity, int taxation_specifics, String productID, String material, String dimensions, String shape) {
        super(name, price, stock_quantity, taxation_specifics, productID, material, dimensions);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nshape: " + shape;
    }

    public void updateshape(){
        System.out.println("enter the new origin:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getShape().equals(id))
                break;
        }
        products[i].setShape(id);
    }
}

