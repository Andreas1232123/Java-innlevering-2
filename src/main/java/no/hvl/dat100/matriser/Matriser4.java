package Matriser;

public class Matriser4 {
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
    public static void main(String[] args) {
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
}