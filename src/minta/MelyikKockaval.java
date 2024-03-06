package minta;

import java.util.Random;
import java.util.Scanner;

public class MelyikKockaval {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int db;
        do {
            System.out.print("Hányszor szeretnél dobni?: ");
            db = sc.nextInt();
        } while (db <= 0);

        final int SOR_KOCKA = 6;
        final int OSZL_KOCKA = 6;
        int[][] dobasok = new int[SOR_KOCKA][OSZL_KOCKA];

        for (int i = 0; i < db; i++) {
            final int SOR_DOBAS = rnd.nextInt(0, 6);
            final int OSZL_DOBAS = rnd.nextInt(0, 6);

            dobasok[SOR_DOBAS][OSZL_DOBAS]++;
        }

        for (int sor = 0; sor < SOR_KOCKA; sor++) {
            for (int oszl = 0; oszl < OSZL_KOCKA; oszl++) {
                System.out.printf("%3d", dobasok[sor][oszl]);
            }
            System.out.println("");
        }
    }
}
