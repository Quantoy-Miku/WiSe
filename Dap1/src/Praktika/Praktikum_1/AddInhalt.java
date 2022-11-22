package Praktika.Praktikum_1;

public class AddInhalt {
    public static int[] increaseArray( int[] arr, int z ){
        for(int i=0; i<arr.length; i++){
            arr[i]+=z;
        }
        return arr;
    }
    public static void main(String[] args) {
    System.out.println("\n------ 7 - Erhöhen der Inhalte eines Feldes ------");
        int[] element13={80,7,1,56,11,72,43,37};
        System.out.println("should be 97,24,18,73,28,89,60,54 ---> "+toStringsui(increaseArray(element13, 17)));
    }
    public static String toStringsui(int[] zahlen){
        String array="";
        for (int i = 0; i < zahlen.length; i++) {
            array+=zahlen[i];
            if(i < zahlen.length-1)
            array+=",";
        }
        return array;
    }
}