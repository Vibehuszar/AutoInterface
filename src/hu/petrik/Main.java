package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Auto> autok = new ArrayList<>();

    public static void main(String[] args) {
        Porsche p1 = new Porsche(150);
        Porsche p2 = new Porsche(200);
        Porsche p3 = new Porsche(300);
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();

        autok.add(p1);
        autok.add(p2);
        autok.add(p3);
        autok.add(t1);
        autok.add(t2);

        for (Auto a : autok){
            System.out.println(a.getSebesseg());
        }
        System.out.println();
        for (Auto a : autok){
            a.gyorsul();
            System.out.println(a.getSebesseg());
        }
    }
}