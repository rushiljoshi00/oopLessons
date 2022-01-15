package com.company;

import org.w3c.dom.Text;

import java.util.Locale;

public class Main { //public keyword is access modifier

    public static void main(String[] args) {
        var textBox1 = new TextBox(); // reference type variables store the address of the textbox object
        // that is on the heap
        var textBox2= textBox1; // textbox2 variable copies that value that textbox1 variable has
        // therefore they are both pointing to the same object

        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
}

// garbage collection automatically removes unused objects on the heap