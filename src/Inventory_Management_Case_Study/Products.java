package Inventory_Management_Case_Study;

import java.util.Scanner;

public class Products extends Inventory_Management{
    private String name;
    private double price;
    private int stock_quantity;
    private int taxation_specifics;
    private String productID;


    public Products(String name, double price, int stock_quantity, int taxation_specifics, String productID) {
        this.name = name;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.taxation_specifics = taxation_specifics;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public int getTaxation_specifics() {
        return taxation_specifics;
    }

    public void setTaxation_specifics(int taxation_specifics) {
        this.taxation_specifics = taxation_specifics;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return
                "\nname: " + name +
                        ", \nprice: " + price +
                        ", \nstock_quantity: " + stock_quantity +
                        ", \ntaxation_specifics: " + taxation_specifics +
                        ", \nproductID: " + productID
                ;
    }

    public void updateid(){
        System.out.println("enter the new id:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getProductID().equals(id))
                break;
        }
        products[i].setProductID(id);
    }

    public void updatename(){
        System.out.println("enter the new name:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getName().equals(id))
                break;
        }
        products[i].setName(id);
    }

    public void updateprice(){
        System.out.println("enter the new id:");
        Scanner sc = new Scanner(System.in);
        double id = sc.nextDouble();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getPrice()==id)
                break;
        }
        products[i].setPrice(id);
    }

    public void updatestock(){
        System.out.println("enter the new stock quantity:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getStock_quantity()==id)
                break;
        }
        products[i].setStock_quantity(id);
    }

    public void updatetaxes(){
        System.out.println("enter the new taxes:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getTaxation_specifics()==id)
                break;
        }
        products[i].setTaxation_specifics(id);
    }

//    public void update(){
//        System.out.println("enter 1 if you want to update name\n2 to update id\n3 to update price\n4 to update taxes" +
//                "\n5 to update stock quantity");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1:
//                updatename();
//                break;
//            case 2:
//                updateid();
//                break;
//            case 3:
//                updateprice();
//                break;
//            case 4:
//                updatetaxes();
//                break;
//            case 5:
//                updatestock();
//                break;
//        }
//    }

    public int getWarranty() {
        return 0;
    }

    public void setWarranty(int warranty) {

    }

    public int getPower_consumption() {
        return 0;
    }

    public void setPower_consumption(int power_consumption) {

    }

    public String getAudioType() {
        return "";
    }

    public void setAudioType(String audioType) {

    }

    public String getOperating_system() {
        return "";
    }

    public void setOperating_system(String operating_system) {

    }

    public int getStorage_capacity() {
        return 0;
    }

    public void setStorage_capacity(int storage_capacity) {

    }

    public int getCamera_resolution() {
        return 0;
    }

    public void setCamera_resolution(int camera_resolution) {

    }

    public String getProcessor_type() {
        return "";
    }

    public void setProcessor_type(String processor_type) {

    }

    public int getRAM_size() {
        return 0;
    }

    public void setRAM_size(int RAM_size) {

    }

    public String getScreen_dimensions() {
        return "";
    }

    public void setScreen_dimensions(String screen_dimensions) {

    }

    public int getCan_size() {
        return 0;
    }

    public void setCan_size(int can_size) {

    }

    public String getOrigin() {
        return "";
    }

    public void setOrigin(String origin) {

    }

    public int getLoadCapacity() {
        return 0;
    }

    public void setLoadCapacity(int loadCapacity) {

    }

    public String getShape() {
        return "";
    }

    public void setShape(String shape) {

    }

    public String getMaterial() {
        return "";
    }

    public void setMaterial(String material) {

    }

    public String getDimensions() {
        return "";
    }

    public void setDimensions(String dimensions) {

    }

    public String getExpiration_date() {
        return "";
    }

    public void setExpiration_date(String expiration_date) {

    }

    public String getNutritional_values() {
        return "";
    }

    public void setNutritional_values(String nutritional_values) {

    }


}

