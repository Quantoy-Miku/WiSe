public class Testat
{
    public static Fraction apply( Fraction[] arr, Fraction x )
    {
        if(arr.length<3||arr.length%2==0){
            return x.add(new Fraction(3,1));
        }
            return x.multiply(arr[arr.length/2]);
    }
}