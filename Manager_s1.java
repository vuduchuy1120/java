/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager_s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class student {

    String ID;
    String name;
    float Ascore;

    public student(String ID, String name, float Ascore) {
        this.ID = ID;
        this.name = name;
        this.Ascore = Ascore;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAscore() {
        return Ascore;
    }

    public void setAscore(float Ascore) {
        this.Ascore = Ascore;
    }

    @Override
    public String toString() {
        return ID + "\t" + name + "\t" + Ascore;
    }
}

public class Manager_s1 {

    void inputmany(ArrayList< student> st, int n) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String id;
        String name;
        float score;
        for (int i = 0; i < n; i++) {
            System.out.println("Input student number #" + (i + 1) + "/" + n);
            System.out.print("Input id: ");
            id = bf.readLine().trim();
            System.out.print("Input name:");
            name = bf.readLine().trim();
            System.out.print("input Ascore");
            score = Float.parseFloat(bf.readLine().trim());
            st.add(new student(id, name, score));
        }
    }

    void output(ArrayList<student> st, int n) {
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i).toString());
        }
    }
// Tìm kiếm thông tin của những sv, nếu tc=1 thì tìm kiếm theo ID. Nếu TC=2 thì tìm kiếm theo score
// Sử dụng Anonymous

    void find(ArrayList<student> st, int n, int tc) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Ano objAno = new Ano() {
            @Override
            public void find_ID() {
                String ID = null;
                System.out.print("Input id you want to find :");
                try {
                    ID = bf.readLine().trim();
                } catch (IOException ex) {
                    Logger.getLogger(Manager_s1.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < n; i++) {
                    if (st.get(i).ID.equalsIgnoreCase(ID)) {
                        System.out.println(st.get(i).toString());
                    }

                }
            }

            @Override
            public void find_Ascore() {
                float score = 0;
                System.out.print("Input Ascore you want to find :");
                try {
                    score = Float.parseFloat(bf.readLine().trim());
                } catch (IOException ex) {
                    Logger.getLogger(Manager_s1.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < n; i++) {
                    if (st.get(i).getAscore() == score) {
                        System.out.println(st.get(i).toString());
                    }
                }
            }
        };
        if (tc == 1) {
            objAno.find_ID();
        }
        if (tc == 2) {
            objAno.find_Ascore();
        }

    }

    // Nếu TC=1 thì sắp xếp theo Name, nếu Tc=2 thì sắp xếp theo name và Score;
    // Sử dụng Collection.sort() và Anonymouse
    void Sort__ID_AS(ArrayList<student> st, int n, int tc) {

        Ano1 obj = new Ano1() {
            @Override
            public void sort_ID() {
                Collections.sort(st, new Comparator<student>() {
                    @Override
                    public int compare(student t, student t1) {
                        return t.ID.compareToIgnoreCase(t1.ID);
                    }
                });
            }

            @Override
            public void sort_Ascore() {
                Collections.sort(st, new Comparator<student>() {

                    @Override
                    public int compare(student t, student t1) {
                        if ((t1.Ascore < t.Ascore)) {
                            return -1;
                        } else if (t1.Ascore > t.Ascore) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }

                });
            }

        };
        if (tc == 1) {
            obj.sort_ID();
        }
        if (tc == 2) {
            obj.sort_Ascore();
        }

    }

    ;



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Manager_s1 obj = new Manager_s1();
        ArrayList<student> stmain = new ArrayList<>();
        int n;
        System.out.print("n = ");
        n = Integer.parseInt(bf.readLine());
        obj.inputmany(stmain, n);
        obj.output(stmain, n);
        obj.find(stmain, n, 1);
        obj.find(stmain, n, 2);
        obj.Sort__ID_AS(stmain, n, 1);
        obj.output(stmain, n);
        obj.Sort__ID_AS(stmain, n, 2);
        obj.output(stmain, n);

    }
}

interface Ano {

    public void find_ID();

    public void find_Ascore();
}

interface Ano1 {

    public void sort_ID();

    public void sort_Ascore();
}
