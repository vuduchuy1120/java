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
public class Painting extends Item {

    private int height;

    private int weight;

    private boolean isWatercolour;

    private boolean isFramed;

    //default constructor
    public Painting() {

    }

    public Painting(int value, String creator, int height, int weight, boolean isWatercolor, boolean isFramed) {

        super(value, creator);

        this.height = height;

        this.weight = weight;

        this.isWatercolour = isWatercolor;

        this.isFramed = isFramed;

    }

    public int getHeight() {

        return height;

    }

    public void setHeight(int height) {

        this.height = height;

    }

    public int getWeight() {

        return weight;

    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

    public boolean isWatercolour() {

        return isWatercolour;

    }

    public void setWatercolour(boolean isWatercolour) {

        this.isWatercolour = isWatercolour;

    }

    public boolean isFramed() {

        return isFramed;

    }

    public void setFramed(boolean isFramed) {

        this.isFramed = isFramed;

    }

    public void inputPainting() {

        input();

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a height: ");

        height = sc.nextInt();

        System.out.print("Input a weight: ");

        weight = sc.nextInt();

        System.out.println("Input True if water color is used otherwise enter False");

        isWatercolour = sc.nextBoolean();

        System.out.println("Input True if painting is framed otherwise enter False");

        isFramed = sc.nextBoolean();

    }

    public void outputPainting() {

        output();

        System.out.println("Height: " + height);

        System.out.println("Weight: " + weight);

        System.out.println("Water colous used: " + isWatercolour);

        System.out.println("Is painting framed: " + isFramed);

    }
}
