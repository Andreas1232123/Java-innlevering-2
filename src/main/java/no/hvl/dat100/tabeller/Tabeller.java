package no.hvl.dat100.tabeller;
import java.util.Scanner;
public class Tabeller {

	public static void main(String[] args) {

        skrivUt(null);
        System.out.print(tilStreng(null));
		System.out.print(summer(null));
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
        scanner.close();
        int tall = 3;
        int posisjon = posisjonTall(tallitabell, tall);
        System.out.println("Første forekomst av " + tall + " er på indeks: " + posisjon);
		int [] reverstabell = reverser(tallitabell);
        for (int revers : reverstabell) {
            System.out.print(revers + " ");
        }
		System.out.print(erSortert(tallitabell));
		int[] tabell4 = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        int[] kombinert = settSammen(tallitabell, tabell4);
        System.out.print("[");
        for (int i = 0; i < kombinert.length; i++) {
            System.out.print(kombinert[i]);
            if (i < kombinert.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

	// a)
	public static void skrivUt(int[] tabell) {
            int [] tallitabell= {8,16,24,32,40,48,56,64,72,80};
            for (int i=0;i<tallitabell.length;i++){
                System.out.print(tallitabell[i] + " ");
            }
    }

	// b)
	public static String tilStreng(int[] tabell) {
            int[] talliB = {42, 67, 89};
            StringBuilder tall = new StringBuilder();
            tall.append("[");
            for (int i=0;i<talliB.length;i++){
                tall.append(talliB[i]);
                if (i < talliB.length-1){
                    tall.append(",");
                }
            }
            tall.append("]");
            return tall.toString();
        }
	// c)
	public static int summer(int[] tabell) {
        int[] tallitabell = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int sum = 0;
        for (int i = 0; i < tallitabell.length; i++) {
            sum += tallitabell[i];
        }
        return sum;
    }

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for  (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] reverser = new int[tabell.length];
        for  (int i = 0; i < tabell.length; i++) {
            reverser[i]  = tabell[tabell.length - 1 - i];
        }
        return reverser;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for(int i = 0; i < tabell.length - 1; i++){
            if (tabell[i] > tabell[i+1] ){
                return false;
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] Sammen = new int[tabell1.length + tabell2.length];
        System.arraycopy(tabell1, 0, Sammen, 0, tabell1.length);
        System.arraycopy(tabell2, 0, Sammen, tabell1.length, tabell2.length);
        return Sammen;

	}
}
