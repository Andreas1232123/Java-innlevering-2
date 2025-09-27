package Tabeller;

public class Tabeller8 {
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] Sammen = new int[tabell1.length + tabell2.length];
        System.arraycopy(tabell1, 0, Sammen, 0, tabell1.length);
        System.arraycopy(tabell2, 0, Sammen, tabell1.length, tabell2.length);
        return Sammen;
    }

    public static void skrivUtArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] tallitabell = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int[] tabell4 = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        int[] kombinert = settSammen(tallitabell, tabell4);
        skrivUtArray(kombinert);
    }
}