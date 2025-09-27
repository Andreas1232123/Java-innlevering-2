package Matriser;

public class Matriser2 {
    public static String tilStreng(int[][] matrise){
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
    public static void main(String[] args) {
        int[][] matrise = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(tilStreng(matrise));
    }
}