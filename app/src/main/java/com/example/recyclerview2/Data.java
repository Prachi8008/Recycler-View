package com.example.recyclerview2;


public class Data {

    // variables (datatype variableName;)
    public String Description;
    int img;
    int img2;

    // constructor (class ke name se banta hai)
    // (public class name(Parameter))
    public Data(String description, int img, int img2) {
        this.Description = description;
        this.img = img;
        this.img2 = img2;
    }

    // Getter
    public String getDescription(){
        return Description;
    }

    public int getImg() {
        return img;
    }

    public int getImg2() {
        return img2;
    }
}
