package com.company;

/**
 * Created by Daniel_D'AGE on 21.06.2018.
 */
public class DoWhileLoop {
    public static void main(String[] args) {

        int tab[] = new int[7];

        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 5;
        tab[3] = 7;
        tab[4] = 2;
        tab[5] = 3;
        tab[6] = 8;

        for (int i =0; i<tab.length; i++){

            System.out.println("Element zmiennej to: " + tab[i]);

        } //pętla foreach
        for (int x:tab) {
            System.out.println(x);
        }
        //pętla while
        int n = 10;
        while(n>=0){
            System.out.println("Wartośc zmiennej wynosi: " + n);
            n--;
        }
        //pętla do while

        do {
            System.out.println("Przykałdowy tekst");
            n++;
        }
        while(n>5);
        {
            System.out.println("Koniec pętli.");
        }

    }
}

