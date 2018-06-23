package BigAilerons;

import java.util.Random;

/**
 * Created by Daniel_D'AGE on 23.06.2018.
 */
//Excercises
//Duży lotek
public class Main {
    public static void main(String[] args) {

        Random generator = new Random();
        //0...48
        for (int i = 1; i <= 6; i++) {
            System.out.println(generator.nextInt(49)+1); // +1, ponieważ java liczy od 0

        }
        System.out.println("End of the draw!"); // Koniec losowania


    }
}
