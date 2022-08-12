package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String title, String descriptionOfContents, int storageCapacity, int layers) {
        super(title, descriptionOfContents, storageCapacity, layers=1);
    }

    @Override
    public void storeData() {
        System.out.println("CDs can store up to 700 MB of data. This CD stores " + getStorageCapacity());
    }

    @Override
    public void reportData() {
        System.out.println("CD is reporting field specific data from " + getTitle());
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    @Override
    public void writeData() {
        System.out.println("Burn me a CD, please? Limewire?");
    }

    @Override
    public void readData() {
        System.out.println("The computer is reading the disc.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
