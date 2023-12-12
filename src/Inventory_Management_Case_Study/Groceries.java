package Inventory_Management_Case_Study;

import java.util.Scanner;

public class Groceries extends Products{
    String expiration_date;
    String nutritional_values;

    public Groceries(String name, double price, int stock_quantity, int taxation_specifics, String productID, String expiration_date, String nutritional_values) {
        super(name, price, stock_quantity, taxation_specifics, productID);
        this.expiration_date = expiration_date;
        this.nutritional_values = nutritional_values;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getNutritional_values() {
        return nutritional_values;
    }

    public void setNutritional_values(String nutritional_values) {
        this.nutritional_values = nutritional_values;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nexpiration_date: " + expiration_date + '\'' +
                ", \nnutritional_values: " + nutritional_values
                ;
    }

    public void updateexpirtiondate(){
        System.out.println("enter the new expiration date:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getExpiration_date().equals(id))
                break;
        }
        products[i].setExpiration_date(id);
    }

    public void updatenutritions(){
        System.out.println("enter the new nutriotional values:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getNutritional_values().equals(id))
                break;
        }
        products[i].setNutritional_values(id);
    }
}

