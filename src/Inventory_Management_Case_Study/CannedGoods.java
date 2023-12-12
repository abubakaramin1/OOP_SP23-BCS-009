package Inventory_Management_Case_Study;

import java.util.Scanner;

public class CannedGoods extends Groceries{
    private int can_size;

    public CannedGoods(String name, double price, int stock_quantity, int taxation_specifics, String productID, String expiration_date, String nutritional_values, int can_size) {
        super(name, price, stock_quantity, taxation_specifics, productID, expiration_date, nutritional_values);
        this.can_size = can_size;
    }

    public int getCan_size() {
        return can_size;
    }

    public void setCan_size(int can_size) {
        this.can_size = can_size;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncan_size: " + can_size
                ;
    }

    public void updatecansize(){
        System.out.println("enter the new can size:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getCan_size()==id)
                break;
        }
        products[i].setCan_size(id);
    }
}

