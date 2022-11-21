package Praktika.Praktikum_1;

public class WerteAufsummieren {
    public static int sumUpNegatives( int[] arr ){
        int sum = 0;
        for(int i: arr){
            if(i<0)
            sum+=i;
        }
        return sum;
    }public static void main(String[] args) {
        int [] test={-1,2,3,-4,5,-6};
        System.out.println(sumUpNegatives(test));
    }
}
