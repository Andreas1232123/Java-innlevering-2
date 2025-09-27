package Tabeller;

public class Tabeller6 {
    public static int[] reverser(int[] tabell) {
        int [] reverser = new int[tabell.length];
        for  (int i = 0; i < tabell.length; i++) {
            reverser[i]  = tabell[tabell.length - 1 - i];
        }
        return reverser;
    }
    public static void main(String[] args) {
        int[] tallitabell = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int [] reverstabell = reverser(tallitabell);
        for (int tall : reverstabell) {
            System.out.print(tall + " ");
        }
    }
}