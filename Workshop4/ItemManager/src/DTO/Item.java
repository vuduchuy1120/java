/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Item {

    protected int value;

    protected String creator;

    Item() {

    }

    Item(int value, String creator) {

        this.value = value;

        this.creator = creator;

    }


    public int getValue() {

        return value;

    }

  
    public void setValue(int value) {

        this.value = value;

    }

    
    public String getCreator() {

        return creator;

    }

    
    public void setCreator(String creator) {

        this.creator = creator;

    }

    public void output() {

        System.out.println("Value: " + value + "\nCreated by: " + creator);

    }

    public void input() {

        Scanner scInput = new Scanner(System.in);

        System.out.print("Input a value: ");

        value = scInput.nextInt();

        while (value <= 0) {

            System.out.print("Entered value is less than 0. Enter again: ");

            value = scInput.nextInt();

        }

        scInput.nextLine();

        System.out.print("Input the creator: ");

        creator = scInput.nextLine();

    }

}

    

