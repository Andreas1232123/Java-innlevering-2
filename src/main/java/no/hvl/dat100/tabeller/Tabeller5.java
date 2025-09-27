package no.hvl.dat100.tabeller;

public class Tabeller5 {
    public static int posisjonTall(int[] tabell, int tall) {
        for  (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] tallitabell = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int tall = 3;

        int posisjon = posisjonTall(tallitabell, tall);
        System.out.println("Første forekomst av " + tall + " er på indeks: " + posisjon);
    }
}