public class Testat
{
    public static int apply( int[] arr, int i )
    {
        return applyrecursive(arr, i, 0);
        }       

    public static int applyrecursive( int[] arr, int i, int x ){
        if(x>i || (0>i || i>=arr.length)){
            return 0;
        }
        if(0>i || i>=arr.length){
            return applyrecursive(arr, i, x+1);

        }
        if(0<=x && x<=i && arr[x]%2==0 && arr[x]>0){
            return arr[x] + applyrecursive(arr, i, x+1);
    }
    return applyrecursive(arr, i, x+1);
    }
}