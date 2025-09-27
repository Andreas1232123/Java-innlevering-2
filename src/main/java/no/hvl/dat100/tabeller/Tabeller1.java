package no.hvl.dat100.tabeller;

public class Tabeller1 {
    public static void main(String[] args) {
        skrivUt(null);
    }
    public static void skrivUt(int[] tabell) {
        int [] tallitabell= {8,16,24,32,40,48,56,64,72,80};
        for (int i=0;i<tallitabell.length;i++){
            System.out.print(tallitabell[i] + " ");
        }
    }
}