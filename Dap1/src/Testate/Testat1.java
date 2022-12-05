package Testate;

public class Testat1 {

    public static int[] apply( int[] arr, int x ){

        int [] neu = new int [arr.length];
        for ( int i=0; i < arr.length; i++ ){
            neu [i] = arr[i];
            if(i%2==0)
            neu [i] = x;
        }
        return neu;
    }
    public static void main( String args[] )
    {
        // Beispiel 1
        int[] arr1 = {1,2,3,4,5,6};
        int[] erg1 = Testat1.apply( arr1, 7 );
        showArray( erg1 );
        //Beispiel 2
        int[] arr2 = {1,2,3,3,4,5};
        int[] erg2 = Testat1.apply( arr2, 3 );
        showArray( erg2 );
        //Beispiel 3
        int[] arr3 = {1,2,3,4,5};
        int[] erg3 = Testat1.apply( arr3, -3 );
        showArray( erg3 );
        //Beispiel 4
        int[] arr4 = {1,2,3};
        int[] erg4 = Testat1.apply( arr4, 5 );
        showArray( erg4 );
        //Beispiel 5
        int[] arr5 = {1,2};
        int[] erg5 = Testat1.apply( arr5, 7 );
        showArray( erg5 );
        //Beispiel 6
        int[] arr6 = {1};
        int[] erg6 = Testat1.apply( arr6, 5 );
        showArray( erg6 );
        //Beispiel 7
        int[] arr7 = {};
        int[] erg7 = Testat1.apply( arr7, 2 );
        showArray( erg7 );
    }
    
    private static void showArray( int[] arr )
    {
        String res = ""; for ( int i : arr ) { res += i + ","; }
        System.out.println( "{" + ( res.length()>0 ? res.substring( 0, res.length()-1 ) : "" ) + "}" );
    }
}
        
    
