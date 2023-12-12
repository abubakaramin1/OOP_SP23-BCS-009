package Inventory_Management_Case_Study;

import java.util.Scanner;

public class FreshGoods extends Groceries{
    private String origin;

    public FreshGoods(String name, double price, int stock_quantity, int taxation_specifics, String productID, String expiration_date, String nutritional_values, String origin) {
        super(name, price, stock_quantity, taxation_specifics, productID, expiration_date, nutritional_values);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\norigin: " + origin
                ;
    }

    public void updateorigin(){
        System.out.println("enter the new origin:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getOrigin().equals(id))
                break;
        }
        products[i].setOrigin(id);
    }
}

