package Praktika.Praktikum_1;

public class Palindrome {
    public static boolean checkArray( int[] arr ){
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-i-1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("\n------ 6 - Palindrome erkennen ------");
        int[] ispalindrome={12, 34, 78, 34, 12};
        int[] ispalindrome1={5, 17, 88, 88, 17, 5};
        int[] nopalindrome={5, 17, 88, 88, 5};

        System.out.println("should be true: "+checkArray(ispalindrome));
        System.out.println("should be true: "+checkArray(ispalindrome1));
        System.out.println("should be false: "+checkArray(nopalindrome));
    }
}
