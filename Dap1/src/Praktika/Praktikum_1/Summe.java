package Praktika.Praktikum_1;
public class Summe 
{   
    public static void main(String[] args)
    {
        System.out.println(interval (5,11));
    }
        public static int interval( int a, int b )
        {   
            int value=a;
            int subtotal=0;
            while ( value <= b )
                {
                subtotal = subtotal + value;
                value = value + 1;
                }
                return subtotal;
        }
}
    


