package Praktika.Praktikum_1;

public class Quersumme 
{
    public static void main(String[] args) 
    {
        System.out.println(digitSum(391)); 
    }
    public static int digitSum( int x )
    {
        int sum = 0;
        while( x != 0)
    {
         sum = sum + (x % 10);
        x = x / 10;
    }
        return sum;
    }
}
