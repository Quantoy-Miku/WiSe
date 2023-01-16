package Übungsblätter.Übungsblatt_2;

public class ZweiDimFelder {
   public static boolean isSquare( int[][] matrix ){
        if(matrix.length==matrix[0].length){
            return true;
        }
        return false;
   }

   public static void scalMult( int[][] matrix, int k ){
        for(int i=0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[i].length-1; j++){
                matrix[i][j]*=k;
            }
        }
    }
    public static int[] extractDiagonal( int[][] matrix ){
        int[] m = new int[matrix.length];
        for(int i=0; i<matrix.length-1; i++){
            m[i]=matrix[i][i];
        }
        return m;
    }
}
