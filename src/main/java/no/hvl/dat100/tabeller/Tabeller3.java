package no.hvl.dat100.tabeller;

public class Tabeller3 {
    public static void main(String[] args) {
        System.out.print(summer(null));
    }

    public static int summer(int[] tabell) {
        int[] tallitabell = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int sum = 0;
        for (int i = 0; i < tallitabell.length; i++) {
            sum += tallitabell[i];
        }
        return sum;
    }
}