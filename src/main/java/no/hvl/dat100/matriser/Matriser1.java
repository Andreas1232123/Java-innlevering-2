package no.hvl.dat100.matriser;

public class Matriser1 {
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    void main() {
        int[][] matrise = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        skrivUt(matrise);
    }
}