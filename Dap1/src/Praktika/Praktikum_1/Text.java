package Praktika.Praktikum_1;

public class Text 
{
    public static void main(String[] args) 
    {
        System.out.println(digitToString(5));
    }
        public static String[] zahlen={"null","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun"};
        public static String digitToString( int z1 )
        {
        return zahlen[z1];
        }
}
