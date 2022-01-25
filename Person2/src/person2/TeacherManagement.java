/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person2;

import java.util.Scanner;

/**
 *
 * @author vuduc
 */
public class TeacherManagement {

    Teacher[] tc;
    int n;
    Scanner sc = new Scanner(System.in);

    void inputMany() {
        System.out.print("n = ");
        n = Integer.parseInt(sc.nextLine());
        tc = new Teacher[n];
        float xSalary;
        String xDp;
        String xId;
        String xName;
        int xAge;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin giáo viên thứ " + (i+1));
            System.out.print("xId = ");
            xId = sc.nextLine();
            System.out.print("Name = ");
            xName = sc.nextLine();
            System.out.print("Age = ");
            xAge = Integer.parseInt(sc.nextLine());
            System.out.print("Salary = ");
            xSalary = Float.parseFloat(sc.nextLine().trim());
            System.out.print("Department = ");
            xDp = sc.nextLine();
            tc[i] = new Teacher(xSalary, xDp, xId, xName, xAge);
        }
    }

    void outputMany() {
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "" +tc[i]);
        }
    }

    void find() {
        int count = 0, vt = 1;
        for (int i = 0; i < n; i++) {
            if(tc[i].salary >= 10000){
                count++;
                System.out.println(vt +""+ tc[i]);
                vt++;
            }
        }
        System.out.println("So nguoi thoa man: " +count);
    }

    public static void main(String[] args) {
        TeacherManagement ob = new TeacherManagement();
        ob.inputMany();
        System.out.println("\n\t\t\tDANH SÁCH GIÁO VIÊN \n");
        System.out.println("STT Id       Họ và tên                Lương    Phòng ban");
        ob.outputMany();
        System.out.println("\n\t\t\tDANH SÁCH GIÁO VIÊN CÓ MỨC LƯƠNG >= 10000: \n");
        System.out.println("STT Id       Họ và tên                Lương    Phòng ban");
        ob.find();
    }

}
