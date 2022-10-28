package Praktika.Praktikum_1;
public class Praktikum_1 
{   
    public static void main(String[] args)
    {
        System.out.println(interval (subtotal));
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
    


