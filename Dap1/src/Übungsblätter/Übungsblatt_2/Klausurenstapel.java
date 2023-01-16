package Übungsblätter.Übungsblatt_2;

public class Klausurenstapel {
    public static boolean writtenBoth( int[] exam1, int[] exam2 ){
        for(int i=0; i<exam1.length-1; i++){
            for(int j=0; j<exam2.length-1; j++){
                if(exam1[i]==exam2[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean notWrittenBoth( int[] exam1, int[] exam2 ){
        return !writtenBoth(exam1, exam2);
    }

    public  static int countWrittenBoth( int[] exam1, int[] exam2 ){
        int counter=0;
        for(int i=0; i<exam1.length-1; i++){
            for(int j=0; j<exam2.length-1; j++){
                if(exam1[i]==exam2[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean biggerThan( int[] exam1, int[] exam2 ){
        for(int i=0; i<exam1.length-1; i++){
            for(int j=0; j<exam2.length-1; j++){
                if(exam1[i]<exam2[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

