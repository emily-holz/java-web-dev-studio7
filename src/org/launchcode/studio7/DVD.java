package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String title, String descriptionOfContents, int storageCapacity, int layers) {
        super(title, descriptionOfContents, storageCapacity, layers=2);
    }

    @Override
    public void storeData() {
        System.out.println("DVDs can store up to 17 GB of data. This one stores " + getStorageCapacity());
    }

    @Override
    public void reportData() {
        System.out.println("This DVD is reporting field specific data from "+ getTitle());
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570-1600 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Burn me a copy of that movie?");
    }

    @Override
    public void readData() {
        System.out.println("DVD player is reading my disc.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
