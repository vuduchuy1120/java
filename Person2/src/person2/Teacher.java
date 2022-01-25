/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person2;

/**
 *
 * @author vuduc
 */
public class Teacher extends Person2 {

    float salary;
    String dp;

    public Teacher() {
        super();
    }

    public Teacher(float salary, String dp, String id, String name, int age) {
        super(id, name, age);
        this.salary = salary;
        this.dp = dp;
    }

    public float getSalary() {
        if(age >= 50)
            return salary + salary * (float)10/100;
        else
            return salary + salary * (float)5/100;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }
    
    @Override
    public String toString() {
        return String.format("|%-8s|%-25s|%8.2f|%10s|", id, name, getSalary(),dp);
//        return  "name : " +name + "\tsalary : " + getSalary() + " \tDeparment: " + dp ;
    }

}
