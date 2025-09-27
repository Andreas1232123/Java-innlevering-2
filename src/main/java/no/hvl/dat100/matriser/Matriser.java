package no.hvl.dat100.matriser;

public class Matriser {
  void main() {
        int[][] matrise = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        skrivUt(matrise);
	   	System.out.println(tilStreng(matrise));
	  	int tall = 6;
        int[][] resultat = skaler(tall, matrise);
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
	  	int[][] a = {
            {1, 2, 4},
            {4, 5, 6},
            {7, 8, 9}
        };
	  	int[][] b = {
                {1, 2, 3},
        };
        System.out.println(erLik(a,b));
    }
	
	// a)
	public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

	// b)
	public static String tilStreng(int[][] matrise) {
        StringBuilder tall = new StringBuilder();
        for (int i=0;i<matrise.length;i++){
            for (int j=0;j<matrise[i].length;j++){
                tall.append(matrise[i][j]);
                if (j < matrise[i].length-1) {
                    tall.append(" ");

                }
            }
            tall.append("\n");
        }
        return tall.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {	
        int[][] Nymatrise = new int[matrise.length][matrise[0].length];
        for (int i=0;i< matrise.length;i++) {
            for (int j=0;j< matrise[i].length;j++) {
                Nymatrise[i][j]=matrise[i][j]*tall;
            }
        }
		return Nymatrise;
	}

	// d)
    public static boolean erLik(int[][] mat1, int[][] mat2){
        if(mat1.length == mat2.length){
            for(int i = 0; i < mat1.length; i++){
                for(int j = 0; j < mat1[i].length; j++){
                    if(mat1[i][j] == mat2[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}	

