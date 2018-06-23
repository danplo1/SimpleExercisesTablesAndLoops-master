package com.company;

/**
 * Created by Daniel_D'AGE on 21.06.2018.
 */
public class MultidimensionalTables {
    public static void main(String[] args) {

        //int table[] = new int[7];
       // System.out.println(table[7]); tablice wielowymiarowe to tablice tablic

        int table1 [] = {2,3,4};
        for (int y: table1) {
            System.out.println(y);

        }

        int table [][] = {{1,5,7}, {2,4,6}};
        // pętla złożona, to pętla w pętli

        for(int i =0; i<table.length; i++){
            for( int j =0; j<table[i].length; j++){
                System.out.println(table[i] [j]);
            }
        }
        for (int a = 7; a>0; a--){
            for (int b = 7; b<10; b++){
                System.out.println("Zmienna a = " + a + " , natomiast zmienna b =" + b);
            }

        }

    }
}
