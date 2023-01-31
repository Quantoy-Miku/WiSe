package Übungsblätter.Übungsblatt_3;

public class Date {
    private String beschreibung;
    private PointInTime start;
    private Period dauer;

    public Date(String beschreibung, PointInTime start, Period dauer){
        this.beschreibung = beschreibung;
        this.start = start;
        this.dauer = dauer;
    }

    public Date clone(){
        return new Date(beschreibung, start, dauer);
    }

    public String getBeschreibung(){
        return beschreibung;
    }

    public PointInTime getStart(){
        return start;
    }

    public Period getDauer(){
        return dauer;
    }
    
    public void set(PointInTime start, Period dauer){
        this.start = start;
        this.dauer = dauer;
    }

    public void change(int verschiebung){
        if(start==null){
            return;
        }
        start.change(verschiebung);
    }

    public String toString(){
        return beschreibung + "\n beginn: " + start + "\n dauer: " + dauer;
    }

    public static void main(String[] args) {
        System.out.println(new Date("treffen", new PointInTime(2023, 31, 21), new Period(120)).toString());
    }
}
