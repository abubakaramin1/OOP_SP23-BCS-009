package Inventory_Management_Case_Study;

import java.util.Scanner;

public class Laptop extends electronics{
    private String processor_type;
    private int RAM_size;
    private String screen_dimensions;

    public Laptop(String name, double price, int stock_quantity, int taxation_specifics, String productID, int power_consumption, int warranty, String processor_type, int RAM_size, String screen_dimensions) {
        super(name, price, stock_quantity, taxation_specifics, productID, power_consumption, warranty);
        this.processor_type = processor_type;
        this.RAM_size = RAM_size;
        this.screen_dimensions = screen_dimensions;
    }

    public String getProcessor_type() {
        return processor_type;
    }

    public void setProcessor_type(String processor_type) {
        this.processor_type = processor_type;
    }

    public int getRAM_size() {
        return RAM_size;
    }

    public void setRAM_size(int RAM_size) {
        this.RAM_size = RAM_size;
    }

    public String getScreen_dimensions() {
        return screen_dimensions;
    }

    public void setScreen_dimensions(String screen_dimensions) {
        this.screen_dimensions = screen_dimensions;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nprocessor_type: " + processor_type +
                ", \nRAM_size: " + RAM_size +
                ", \nscreen_dimensions: " + screen_dimensions
                ;
    }

    public void updateprocessor(){
        System.out.println("enter the new processor type:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getProcessor_type().equals(id))
                break;
        }
        products[i].setProcessor_type(id);
    }

    public void updatescreen(){
        System.out.println("enter the new screen dimensions:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getScreen_dimensions().equals(id))
                break;
        }
        products[i].setScreen_dimensions(id);
    }

    public void updateRAM(){
        System.out.println("enter the new RAM size:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getRAM_size()==id)
                break;
        }
        products[i].setRAM_size(id);
    }

}

