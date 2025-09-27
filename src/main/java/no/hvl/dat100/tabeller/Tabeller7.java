package no.hvl.dat100.tabeller;

public class Tabeller7 {
    public static boolean erSortert(int[] tabell){
        for(int i = 0; i < tabell.length - 1; i++){
            if (tabell[i] > tabell[i+1] ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] tallitabell = {80, 16, 24, 32, 40, 48, 56, 64, 72, 8};
        System.out.print(erSortert(tallitabell));
    }
}