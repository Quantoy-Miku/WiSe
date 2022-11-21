package Praktika.Praktikum_1;

public class WerteZaehlen {
    public static int countNegatives( int[] arr ){
        int counter = 0;
        for (int i : arr) {
        if(i<0) 
        counter++;
       }   
        return counter;
    }
    public static void main(String[] args) {
        int [] test={-1,2,3,-4,5,-6};
        System.out.println(countNegatives(test));
    }
}
