package Inventory_Management_Case_Study;

import java.util.Scanner;

public class electronics extends Products{
    private int power_consumption;
    private int warranty;

    public electronics(String name, double price, int stock_quantity, int taxation_specifics, String productID, int power_consumption, int warranty) {
        super(name, price, stock_quantity, taxation_specifics,productID);
        this.power_consumption = power_consumption;
        this.warranty = warranty;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npower_consumption: " + power_consumption +
                ", \nwarranty: " + warranty
                ;
    }

    public void updatewarranty(){
        System.out.println("enter the new warranty:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getWarranty()==id)
                break;
        }
        products[i].setWarranty(id);
    }

    public void updatepower(){
        System.out.println("enter the new power consumption:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getPower_consumption()==id)
                break;
        }
        products[i].setPower_consumption(id);
    }


}
