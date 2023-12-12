package Inventory_Management_Case_Study;

import java.util.Scanner;

public class Furniture extends Products{
    private String material;
    private String dimensions;

    public Furniture(String name, double price, int stock_quantity, int taxation_specifics,String productID, String material, String dimensions) {
        super(name, price, stock_quantity, taxation_specifics,productID);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmaterial: '" + material  +
                ", \ndimensions: " + dimensions
                ;
    }

    public void updatematerial(){
        System.out.println("enter the new material:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getMaterial().equals(id))
                break;
        }
        products[i].setMaterial(id);
    }

    public void updatedimensions(){
        System.out.println("enter the new dimensions:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getDimensions().equals(id))
                break;
        }
        products[i].setDimensions(id);
    }
}

