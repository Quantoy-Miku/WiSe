package Übungsblätter.Übungsblatt_2;

public class GrossterTeiler {
    public static int greatestProperDivisor( int n ){
        
        if(n<0){
            n = -n;
        }
         for(int i=2; i<n/2; i++){
            if(n%i==0)
            return n/i;
         }
         return 1;
        }
        public static void main(String[] args) {
            System.out.println(greatestProperDivisor(7));
        }
}

