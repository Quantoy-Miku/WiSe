package Praktika.Praktikum_2;

public class BruchZaehlen{
    public static final char[] Fraction = null;
    public static Fraction countNegatives( Fraction[] arr ){
        int counter=0;
        for (Fraction fraction : arr) {
            if(fraction.GetDenom()==0 && fraction.GetNum()==0){
                continue;
            }
            if(fraction.IsNegative()){
                counter++;
            }
        }
        return new Fraction(counter, arr.length);
    }
    public static void main(String[] args) {
        Fraction[] arr={new Fraction(-3,7),new Fraction(1, 4),new Fraction(5,0), new Fraction(2,-6)};
        System.out.println(countNegatives(arr).toString());
    }
}

    