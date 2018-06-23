package com.company;

public class Main {

    public static void main(String[] args) {

        int tab[] = new int[5];
        tab[0] = 6; //przypisanie wartości do zmiennej;

        System.out.println(tab[0]);
        System.out.println(tab); //pokaże identyfikator naszej zmiennej;
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 5;
        tab[3] = 7;
        tab[4] = 2;

        for (int i =0; i<5; i++){
            System.out.println("Element zmiennej to " + tab[i]); //pętla for
        }


        }


    }





