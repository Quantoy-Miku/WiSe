package Praktika.Praktikum_1;

public class SortierungPrufen {
    public static boolean isSorted( int[] arr ){
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
         }
         return true;
    }
    public static void main(String[] args) {
        System.out.println("\n------ 5 - Sortierung prüfen ------");
        int[] element16={1,4,5,7,8};
        System.out.println("should be true ---> "+(isSorted(element16)));
        int[] element17={1,4,5,7,7,8};
        System.out.println("should be true ---> "+(isSorted(element17)));
        int[] element18={1,4,5,3,7,8};
        System.out.println("should be false ---> "+(isSorted(element18)));
    }
}
