package Praktika.Praktikum_2;

public class Fraction {
    private int numerator;
    private int denominator;

    public boolean IsNegative(){
        return denominator<0||numerator<0;
        }
    public Fraction (int num, int denom){
        if(denom==0){
            this.numerator=0;
            this.denominator=0;
            return;
        }
        this.numerator=num;
        this.denominator=denom;
    }
    public int GetNum(){
        return numerator;
    }
    public int GetDenom(){
        return denominator;
    }
    public void SetNum(int num){
        this.numerator=num;
    }
    public void SetDenom(int denom){
        this.denominator=denom;
    }
    @Override
    public String toString(){
        return numerator+" / "+denominator;
    }
}
