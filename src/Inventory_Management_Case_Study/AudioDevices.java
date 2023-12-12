package Inventory_Management_Case_Study;

import java.util.Scanner;

public class AudioDevices extends electronics{
    private String audioType;

    public AudioDevices(String name, double price, int stock_quantity, int taxation_specifics, String productID, int power_consumption, int warranty, String audioType) {
        super(name, price, stock_quantity, taxation_specifics, productID, power_consumption, warranty);
        this.audioType = audioType;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\naudioType: " + audioType
                ;
    }

    public void updateaudioType(){
        System.out.println("enter the new audio type:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        int i;
        for (i = 0; i < products.length; i++) {
            if(products[i].getAudioType().equals(id))
                break;
        }
        products[i].setAudioType(id);
    }
}

