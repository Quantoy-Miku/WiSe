package Praktika.Praktikum_1;

public class AnzahlMax{
    public static int maximum( int[] arr ){
        int max = arr[0];
        for( int i: arr ){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static int countMaximum( int[] arr ){
        int max=maximum(arr),counter=0;
        for(int i:arr){
            if(i==max){
                counter++;
            }
        }
    return counter;
    }
    public static void main(String[] args) {
        int[] element15={1,-7,1,5,-1,2,4,5};
        System.out.println(countMaximum(element15));
    }
}