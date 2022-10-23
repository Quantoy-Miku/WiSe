package Temp;
public class Ganzzaelige_Berechnungen 
{
    public static void main(String[] args) 
    {
     //   System.out.println(remainder(18, 13));
     //   System.out.println(isOdd(11));
     //   System.out.println(isEven(11));
     //   System.out.println(toEven(9));
     //   System.out.println(isDivisible(80, 8, 10 ));
    }
    public static int remainder( int dividend, int divisor )
    {
        return dividend - dividend / divisor * divisor;
    }
    public static int isOdd(int value)
    {
        return remainder(value, 2);
    }
    public static int isEven( int value )
    {
        return 1 - isOdd(value);
    }
    public static int toEven( int value )
    {
        return isOdd( value ) + value;
    }
    public static int isDivisible( int dividend, int divisor1, int divisor2 )
    {
        return remainder(dividend, divisor1) + remainder(dividend, divisor2);
    }
}
