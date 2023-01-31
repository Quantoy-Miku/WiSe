package Übungsblätter.Übungsblatt_3;

public class PointInTime {
    
    private int jahr;
    private int tag;
    private int stunde;

    public PointInTime(int jahr, int tag, int stunde){
        if(jahr>=999 && jahr<10000 && tag>=1 && tag<=365 && stunde>=0 && stunde<=23){
            this.jahr = jahr;
            this.tag = tag;
            this.stunde = stunde;
        }
    }
    @Override
    public String toString(){
        return jahr + "/" + tag + "/" + stunde;
    }
    public PointInTime Clone(){
        return new PointInTime(jahr, tag, stunde);
    }
    public void change(int add){
        int uebertragT, uebertragJ;
        uebertragT = (stunde+add)/24;
        stunde = (stunde+add)%24;
        if(tag+uebertragT>365){
            uebertragJ = (tag+uebertragT)/365;
            tag = (tag+uebertragT)%365;
            jahr += uebertragJ;
        }
    }
}
