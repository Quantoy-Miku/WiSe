package Übungsblätter.Übungsblatt_3;

public class TestClass {
    public static void main(String[] args) {
        
        boolean [][]kek = {
        {true,true,true,false,false},
        {true,false,false,true,true},
        {false,false,false,true,false},
        {true,true,false,false,false},
        {false,true,false,false,false}
        };
        GameOfLife G = new GameOfLife(kek);
        G.show();
        G.nextGeneration();
        G.show();
    }
    
}
