package Übungsblätter.Übungsblatt_3;

public class MultipleStrings {
    
    public String[] texts;

    public MultipleStrings(int n){
        texts = new String[n];
    }

    public boolean addAtPosition( String s, int p ){
        if(p<0 || p>texts.length-1){
            return false;
        }
        texts[p]=s;
        return true;
    }

    public int size(){
        int counter=0;
        for(int i=0; i<texts.length; i++){
            if(texts[i]!=null){
                counter++;
            }
        }
        return counter;
    }

    public int atEnd( String end ){
        int counter = 0;
        for(String s : texts){
            if(s==null){
                continue;
            }
            if(s.endsWith(end));{
                counter++;
            }
        }
        return counter;
    }

    public boolean inAll( char ch ){
        int counter=0;
        for( String s : texts){
            if(s==null){
                continue;
            }
            if(s.contains("" + ch)){
                counter++;
            } 
        }
        return counter == size();
    }

    public void replace( char ch, char rep ){
        for( String s : texts){
            if(s==null){
                continue;
            }
            if(s.contains(""+ch)){
                s = s.replace(ch, rep);
            }
        }
    }
}
