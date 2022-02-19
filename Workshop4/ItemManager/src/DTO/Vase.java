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
public class Vase extends Item {

    private int height;

    private String material;

    public Vase() {
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {

        input();//call to inherited class method

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a height: ");

        height = sc.nextInt();

        sc.nextLine();

        System.out.print("Input a material: ");

        material = sc.nextLine();

    }


    public void outputVase() {

        output();

        System.out.println("Height: " + height);

        System.out.println("Material: " + material);

    }

}
