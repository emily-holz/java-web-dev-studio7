package org.launchcode.studio7;

public abstract class BaseDisc {
    private String title;
    private String descriptionOfContents;
    private int storageCapacity;
    private int layers;
    private static final double thickness = 1.2;


    public BaseDisc(String title, String descriptionOfContents, int storageCapacity, int layers) {
        this.title = title;
        this.descriptionOfContents = descriptionOfContents;
        this.storageCapacity = storageCapacity;
        this.layers = layers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptionOfContents() {
        return descriptionOfContents;
    }

    public void setDescriptionOfContents(String descriptionOfContents) {
        this.descriptionOfContents = descriptionOfContents;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public abstract void storeData();

    public abstract void reportData();

}
