package com.company;

public class TextBox {
    public String text = ""; // string is reference type variable
    // good practice to have an empty string rather than leaving not initializing the string variable to prevent crashes in the program

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
