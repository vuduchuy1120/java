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
public class Statue extends Item {

    private int weight;

    private String colour;

    //default constructor
    public Statue() {

    }

    public Statue(int value, String creator, int weight, String colour) {

        super(value, creator);

        
        this.weight = weight;

        this.colour = colour;

    }

  
    public int getWeight() {

        return weight;

    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

   
    public String getColour() {

        return colour;

    }

    public void setMaterial(String colour) {

        this.colour = colour;

    }

 
    public void inputStatue() {

        input();

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a weight: ");

        weight = sc.nextInt();

        System.out.print("Input a colour: ");

        colour = sc.nextLine();

    }

   
    public void outputStatue() {

        output();

        System.out.println("Weight: " + weight);

        System.out.println("Colour: " + colour);

    }

}

