package Inventory_Management_Case_Study;

import java.util.Arrays;
import java.util.Scanner;

public class Inventory_Management {
    Products[] products = new Products[10];

    public void addProduct(){
        int stop;
        System.out.println("enter 1 if you want to add an electronic product, 2 for furniture and 3 for groceries:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i;
        switch (input){
            case 1:
                System.out.println("enter 1 to add a smartphone, 2 for laptop and 3 for audio devices:");
                int elecinput = sc.nextInt();

                switch (elecinput){
                    case 1:

                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the smartphone:");
                        sc.nextLine();
                        String name = sc.nextLine();

                        System.out.println("enter price of the smartphone:");
                        double price = sc.nextDouble();

                        System.out.println("enter stock quantity of the smartphone:");
                        int quantity = sc.nextInt();

                        System.out.println("enter taxation specifics of the smartphone:");
                        int tax = sc.nextInt();

                        System.out.println("enter ID of the smartphone:");
                        sc.nextLine();
                        String id = sc.nextLine();

                        System.out.println("enter Power consumption of the smartphone:");
                        int power = sc.nextInt();

                        System.out.println("enter warranty of the smartphone:");
                        int warranty = sc.nextInt();

                        System.out.println("enter Operating System of the smartphone:");
                        sc.nextLine();
                        String os = sc.nextLine();

                        System.out.println("enter Storage capacity of the smartphone:");
                        int storage = sc.nextInt();

                        System.out.println("enter camera resolution of the smartphone:");
                        int camera = sc.nextInt();

                        Products sm1 = new SmartPhone(name,price,quantity,tax,id,power,warranty,os,storage,camera);
                        products[i] = sm1;
                        break;

                    case 2:
                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the laptop:");
                        sc.nextLine();
                        String namel = sc.nextLine();

                        System.out.println("enter price of the laptop:");
                        double pricel = sc.nextDouble();

                        System.out.println("enter stock quantity of the laptop:");
                        int quantityl = sc.nextInt();

                        System.out.println("enter taxation specifics of the laptop:");
                        int taxl = sc.nextInt();

                        System.out.println("enter ID of the laptop:");
                        sc.nextLine();
                        String idl = sc.nextLine();

                        System.out.println("enter Power consumption of the laptop:");
                        int powerl = sc.nextInt();

                        System.out.println("enter warranty of the laptop:");
                        int warrantyl = sc.nextInt();

                        System.out.println("enter Processor type of the laptop:");
                        sc.nextLine();
                        String processor = sc.nextLine();

                        System.out.println("enter RAM of the laptop:");
                        int RAM = sc.nextInt();

                        System.out.println("enter screen dimensions of the laptop:");
                        sc.nextLine();
                        String dimensions = sc.nextLine();

                        Products lp1 = new Laptop(namel,pricel,quantityl,taxl,idl,powerl,warrantyl,processor,RAM,dimensions);
                        products[i] = lp1;
                        break;
                    case 3:
                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the Audio Device:");
                        sc.nextLine();
                        String namea = sc.nextLine();

                        System.out.println("enter price of the Audio Device:");
                        double pricea = sc.nextDouble();

                        System.out.println("enter stock quantity of the Audio Device:");
                        int quantitya = sc.nextInt();

                        System.out.println("enter taxation specifics of the Audio Device:");
                        int taxa = sc.nextInt();

                        System.out.println("enter ID of the Audio Device:");
                        sc.nextLine();
                        String ida = sc.nextLine();

                        System.out.println("enter Power consumption of the Audio Device:");
                        int powera = sc.nextInt();

                        System.out.println("enter warranty of the Audio Device:");
                        int warrantya = sc.nextInt();


                        System.out.println("enter screen Audio type of the Audio Device:");
                        sc.nextLine();
                        String type = sc.nextLine();

                        Products ad1 = new AudioDevices(namea,pricea,quantitya,taxa,ida,powera,warrantya,type);
                        products[i] = ad1;
                        break;

                }
                break;
            case 2:
                System.out.println("enter 1 to add a tables and 2 for seating:");
                int furninput = sc.nextInt();

                switch (furninput){
                    case 1:
                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the table:");
                        sc.nextLine();
                        String name = sc.nextLine();

                        System.out.println("enter price of the table:");
                        double price = sc.nextDouble();

                        System.out.println("enter stock quantity of the table:");
                        int quantity = sc.nextInt();

                        System.out.println("enter taxation specifics of the table:");
                        int tax = sc.nextInt();

                        System.out.println("enter ID of the table:");
                        sc.nextLine();
                        String id = sc.nextLine();

                        System.out.println("enter the material of the table:" );
                        String mat = sc.nextLine();

                        System.out.println("enter the dimensions of the table:");
                        String dim = sc.nextLine();

                        System.out.println("enter shape of the table:");
                        String shape = sc.nextLine();

                        Products t1 = new tables(name,price,quantity,tax,id,mat,dim,shape);
                        products[i] = t1;
                        break;

                    case 2:

                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the seating furniture:");
                        sc.nextLine();
                        String names = sc.nextLine();

                        System.out.println("enter price of the seating furniture:");
                        double prices = sc.nextDouble();

                        System.out.println("enter stock quantity of the seating furniture:");
                        int quantitys = sc.nextInt();

                        System.out.println("enter taxation specifics of the seating furniture:");
                        int taxs = sc.nextInt();

                        System.out.println("enter ID of the seating furniture:");
                        sc.nextLine();
                        String ids = sc.nextLine();

                        System.out.println("enter the material of the seating furniture:" );
                        String mats = sc.nextLine();

                        System.out.println("enter the dimensions of the seating furniture:");
                        String dims = sc.nextLine();

                        System.out.println("enter load capacity of the seating furniture:");
                        int load = sc.nextInt();

                        Products s1 = new Seating(names,prices,quantitys,taxs,ids,mats,dims,load);
                        products[i] = s1;
                        break;

                }
                break;

            case 3:
                System.out.println("enter 1 to add a Fresh Goods and 2 for Canned Goods:");
                int groceriesinput = sc.nextInt();

                switch (groceriesinput){
                    case 1:
                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the Fresh Goods:");
                        sc.nextLine();
                        String name = sc.nextLine();

                        System.out.println("enter price of the Fresh Goods:");
                        double price = sc.nextDouble();

                        System.out.println("enter stock quantity of the Fresh Goods:");
                        int quantity = sc.nextInt();

                        System.out.println("enter taxation specifics of the Fresh Goods:");
                        int tax = sc.nextInt();

                        System.out.println("enter ID of the Fresh Goods:");
                        sc.nextLine();
                        String id = sc.nextLine();

                        System.out.println("enter the expiration date of the Fresh Goods:" );
                        String mat = sc.nextLine();

                        System.out.println("enter the nutritional values of the Fresh Goods:");
                        String dim = sc.nextLine();

                        System.out.println("enter origin of the Fresh Goods:");
                        String shape = sc.nextLine();

                        Products f1 = new FreshGoods(name,price,quantity,tax,id,mat,dim,shape);
                        products[i] = f1;
                        break;

                    case 2:

                        for ( i = 0; i < products.length; i++) {
                            if(products[i] == null)
                                break;
                        }
                        System.out.println("enter name of the Canned Goods:");
                        sc.nextLine();
                        String names = sc.nextLine();

                        System.out.println("enter price of the seating Canned Goods:");
                        double prices = sc.nextDouble();

                        System.out.println("enter stock quantity of the seating Canned Goods:");
                        int quantitys = sc.nextInt();

                        System.out.println("enter taxation specifics of the seating Canned Goods:");
                        int taxs = sc.nextInt();

                        System.out.println("enter ID of the seating Canned Goods:");
                        sc.nextLine();
                        String ids = sc.nextLine();

                        System.out.println("enter the expiration date of Canned Goods:" );
                        String mats = sc.nextLine();

                        System.out.println("enter the nutritional values Canned Goods:");
                        String dims = sc.nextLine();

                        System.out.println("enter can size of the seating Canned Goods:");
                        int load = sc.nextInt();

                        Products c1 = new CannedGoods(names,prices,quantitys,taxs,ids,mats,dims,load);
                        products[i] = c1;
                        break;

                }


        }
        System.out.println("if you want to add another product enter 1 or enter 0 to go to the main menu:");
        stop = sc.nextInt();
        if(stop == 1)
            addProduct();
        else menu();

    }

    public void displayProducts(){
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
        System.out.println("enter 0 to go the menu:");Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        if(menu == 0)
            menu();
    }

    @Override
    public String toString() {
        return
                "products in this inventory are: \n" + Arrays.toString(products);
    }

    public void removeProduct() {
        System.out.println("enter the id of the product you want to search for:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if (products[i].getProductID().equals(id)) {
                break;
            }
        }

        if (i < products.length) {
            for (int j = i; j < products.length - 1; j++) {
                products[j] = products[j + 1];
            }
            products[products.length - 1] = null;
        }
        System.out.println("the product has been removed");
        System.out.println("enter 0 to go the menu:");
        int menu = sc.nextInt();
        if(menu == 0)
            menu();
    }

    public void searchProduct(){
        System.out.println("Enter the id of the product you want to search:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        boolean found = false;
        int i;
        for ( i = 0; i < products.length; i++) {
            if (products[i] != null && id.equals(products[i].getProductID())){
                System.out.println(products[i]);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("The id you have provided does not match with any of the products in the inventory.");
        System.out.println("enter 0 to go the menu:");
        int menu = sc.nextInt();
        if(menu == 0)
            menu();
    }

//    public void updateProduct(){
//        System.out.println("enter 1 if you want to update electronics, 2 for furniture and 3 for groceries");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        System.out.println("enter the product id you want to update:");
//        String ID = sc.nextLine();
//        int i;
//        for ( i = 0; i < products.length; i++) {
//            if (products[i].getProductID().equals(ID))
//                break;
//        }
//        switch (choice){
//            case 1:
//                System.out.println("enter 1 if you want to update smartphone, 2 for laptop and 3 for audio devices");
//                int elecchoice = sc.nextInt();
//                switch (elecchoice){
//                    case 1:
//                    System.out.println("enter 1 if you want to update name, 2 for id, 3 for price\n4 for stock quantity" +
//                            "5 for taxes, 6 for power consumption\n7 for warranty, 8 for operating system, 9 for storage capacity\n 10 for camera");
//                    int smchoice = sc.nextInt();
//                    switch (smchoice){
//                        case 1:
//
//                    }
//                }
//        }
//    }

    public void menu(){
        System.out.println("Welcome to the Inventory Management System of our store.\nEnter 1 if you want to add products.\n" +
                "2 if you want to remove products.\n3 if you want to search for the products.\n4 if you want to" +
                "display products\n5 to update products");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                addProduct();
                break;
            case 2:
                removeProduct();
                break;
            case 3:
                searchProduct();
                break;
            case 4:
                displayProducts();
                break;
            case 5:
                update();
                break;
            default:
                System.out.println("You entered an invalid number!");
                menu();
        }
    }

    public void update(){
        System.out.println("enter the id of the product you want to update:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for ( i = 0; i < products.length; i++) {
            if (products[i].getProductID().equals(id))
                break;
        }
        System.out.println("enter 1 if you want to update name, 2 for price, 3 for taxes, 4 for id, 5 for stock quantity");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter new name:");
                sc.nextLine();
                String name = sc.nextLine();
                products[i].setName(name);
                break;
            case 2:
                System.out.println("enter new price:");
                double price = sc.nextDouble();
                products[i].setPrice(price);
                break;
            case 3:
                System.out.println("enter new taxes:");
                int tax = sc.nextInt();
                products[i].setTaxation_specifics(tax);
                break;
            case 4:
                System.out.println("enter new id:");
                String ID = sc.nextLine();
                products[i].setProductID(ID);
                break;
            case 5:
                System.out.println("enter new stock quantity:");
                int st = sc.nextInt();
                products[i].setStock_quantity(st);
                break;
        }
        System.out.println("The changes have been made!");
        System.out.println("enter 0 to go to the menu");
        int me = sc.nextInt();
        if (me == 0)
            menu();
    }
}

