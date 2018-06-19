package com.example.kas042018ad.tablayout;

public class model {
    String name;
    String designation;
int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public model(String name, String designation, int image) {

        this.name = name;
        this.designation = designation;
        this.image = image;
    }
}
