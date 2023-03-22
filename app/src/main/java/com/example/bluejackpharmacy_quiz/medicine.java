package com.example.bluejackpharmacy_quiz;

public class medicine {
    String medicineName, manufacturer, price;
    int image;

    public medicine(String medicineName, String manufacturer, String price, int image) {
        this.medicineName = medicineName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.image = image;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }


}