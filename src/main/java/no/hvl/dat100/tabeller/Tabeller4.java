package Tabeller;

import java.util.Scanner;

public class Tabeller4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tall: ");
        int tallfins = scanner.nextInt();
        int[] tallitabell = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        boolean finnes = finnesTall(tallitabell, tallfins);
        if (finnes) {
            System.out.println(tallfins + " finnes i tabellen.");
        } else {
            System.out.println(tallfins + " finnes IKKE i tabellen.");
        }
    }
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }
}