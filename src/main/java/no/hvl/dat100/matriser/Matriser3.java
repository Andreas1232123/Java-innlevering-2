package no.hvl.dat100.matriser;

public class Matriser3 {
    public static int[][] skaler(int tall, int[][] matrise){
        int[][] Nymatrise = new int[matrise.length][matrise[0].length];
        for (int i=0;i< matrise.length;i++) {
            for (int j=0;j< matrise[i].length;j++) {
                Nymatrise[i][j]=matrise[i][j]*tall;
            }
        }
        return Nymatrise;
    }
    public static void main(String[] args) {
        int[][] matrise = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int tall = 6;
        int[][] resultat = skaler(tall, matrise);
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}