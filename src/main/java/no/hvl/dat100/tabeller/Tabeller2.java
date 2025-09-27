package Tabeller;

public class Tabeller2 {
    public static void main(String[] args) {
        System.out.print(tilStreng(null));
    }
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
}