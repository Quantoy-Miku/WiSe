package Praktika.Praktikum_1;

public class Maximum {
    public static int maximum( int[] arr ){
        int max = arr[0];
        for( int i: arr ){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] test={-1,2,3,-4,5,-6};
        System.out.println(maximum(test));
    }
}
