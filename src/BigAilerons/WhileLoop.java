package BigAilerons;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 23.06.2018.
 */
public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secretNum = 77;
        int userNum;

        do {
            System.out.println("Podaj liczbę: ");
            userNum = scanner.nextInt(); // działa od prawej do lewej
            if (userNum > secretNum) {
                System.out.println("Podana liczba jest za duża.");
            } else {
                System.out.println("Podana liczba jest za mała");
            }
        } while (userNum != secretNum);
        System.out.println("Gratulacje, w końcu podałeś poprawna liczbę!");

        //do zmodyfikowania

    }
}
