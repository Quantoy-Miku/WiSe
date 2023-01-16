package Übungsblätter.Übungsblatt_2;

public class Paare {
    public static int countPairs( int[] arr ){
        int counter=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                i++;
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] arr={6,9,4,4,2,7,8,8,9,9,2,4,1,1,3};
        System.out.println(countPairs(arr));
}
}