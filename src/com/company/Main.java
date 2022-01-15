package com.company;

import org.w3c.dom.Text;

import java.util.Locale;

public class Main { //public keyword is access modifier

    public static void main(String[] args) {
        var textBox1 = new TextBox(); // we are creating a new instance of the textbox class
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox(); // we are creating a new instance of the textbox class
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());
    }
}
