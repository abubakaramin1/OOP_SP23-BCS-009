package Inventory_Management_Case_Study;

import java.util.Scanner;

public class SmartPhone extends electronics{
    private String operating_system;
    private int storage_capacity;
    private int camera_resolution;

    public SmartPhone(String name, double price, int stock_quantity, int taxation_specifics, String productID, int power_consumption, int warranty, String operating_system, int storage_capacity, int camera_resolution) {
        super(name, price, stock_quantity, taxation_specifics, productID, power_consumption, warranty);
        this.operating_system = operating_system;
        this.storage_capacity = storage_capacity;
        this.camera_resolution = camera_resolution;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public int getStorage_capacity() {
        return storage_capacity;
    }

    public void setStorage_capacity(int storage_capacity) {
        this.storage_capacity = storage_capacity;
    }

    public int getCamera_resolution() {
        return camera_resolution;
    }

    public void setCamera_resolution(int camera_resolution) {
        this.camera_resolution = camera_resolution;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\noperating_system: " + operating_system +
                ", \nstorage_capacity: " + storage_capacity +
                ", \ncamera_resolution: " + camera_resolution
                ;
    }

    public void updateoperatingSystem(){
        System.out.println("enter the new Operating System:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getOperating_system().equals(id))
                break;
        }
        products[i].setOperating_system(id);
    }

    public void updateStorage(){
        System.out.println("enter the new storage:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getStorage_capacity()==id)
                break;
        }
        products[i].setStorage_capacity(id);
    }

    public void updatecamera(){
        System.out.println("enter the new camera resolution:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getCamera_resolution()==id)
                break;
        }
        products[i].setCamera_resolution(id);
    }
}

