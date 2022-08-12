package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Red", "Taylor Swift album from college", 500, 1);
        DVD myDVD = new DVD("Big Fish", "Favorite movie", 14, 2);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myCD.writeData();
        myCD.readData();
        myCD.storeData();
        myCD.reportData();

        myDVD.spinDisc();
        myDVD.writeData();
        myDVD.readData();
        myDVD.storeData();
        myDVD.reportData();
    }
}
