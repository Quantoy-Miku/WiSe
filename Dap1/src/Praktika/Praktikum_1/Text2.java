package Praktika.Praktikum_1;

public class Text2 
{
    public static void main(String[] args) {
        System.out.println(intToString(-24));
    }
    public static String intToString( int z ){
        String ende = "";
        String[] zahlen={"null","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun"};
        if(z<0){
            z=z*(-1); 
            ende = "minus-";
        }
        String zahlen2= Integer.toString(z);
        String tmp = "";
        for(int i=0;i<zahlen2.length();i++){
            ende=ende+zahlen[Integer.parseInt(tmp=""+zahlen2.charAt(i))];
            if(i<zahlen2.length()-1){
                ende=ende+"-";
            }
        }
         return ende;
    }

}
