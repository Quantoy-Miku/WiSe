package Übungsblätter.Übungsblatt_3;

public class Period {
    
    private int minutes;

    public Period(int minutes){
        
        if(minutes>0){
            this.minutes = minutes;
        }
        else
            this.minutes = 0;
    }

    public Period(int minutes, int hours){

        if(minutes>0 && hours>0){
            this.minutes = minutes + hours * 60;
        }
        else
            this.minutes = 0;
    }
    public int getMinutes(){
        return minutes;
    }

    public int getHours(){
        return minutes/60;
    }

    public int getMinorMinutes(){
        return minutes - (getHours() * 60);
    }
    @Override
    public String toString(){
        return getHours() + ":" + getMinorMinutes();
    }
    public Period Clone(){
        return new Period(minutes);
    }
    public void change(int add){
        if(add>=0){
            minutes = getMinutes() + add;
        }
    }
}