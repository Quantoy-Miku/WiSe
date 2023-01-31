package Übungsblätter.Übungsblatt_3;

public class GameOfLife {

    private boolean[][] population;

    public GameOfLife(int n){
        population = new boolean [n][n];
    }

    public GameOfLife(boolean[][] area) {
        population=area;
    }

    public boolean nextState( int i, int j ){
        int nachbarn = nachbarn( i , j);
        boolean alive = true;
        switch (nachbarn) {
            case 3:
                alive = true;
                break;
            case 2:
                alive = population[i][j];
                break;
            default:
                alive = false;
                break;

        }
        return alive;
    }
    public void nextGeneration(){
        boolean [][] tmp = new boolean [population.length][population.length];
        for(int i=0; i<population.length; i++){
            for(int j=0; j<population.length; j++){
                tmp[i][j]=nextState(i, j);
            }
        }
        population = tmp;
    }


    public void futureGeneration( int n ){
        for(int i=0; i<n; i++){
            nextGeneration();
        }
    }

    public void randomState() {
		for (boolean[] arr : population) {
			for (int i = 0; i < arr.length; i++) {
				if (java.lang.Math.random() < 0.3) {
					arr[i] = true;
				}
			}
		}
	}

    public void show(){
        String s = "";
            for(int i=0; i<population.length; i++){
                for(int j=0; j<population.length; j++){
                    if(population[i][j]){
                        s+=" 1";
                    }
                    else
                    s+=" 0";
                }
                s+="\n";
            }
            System.out.println(s);
    }

    public void shownachbarn(){
        String s = "";
            for(int i=0; i<population.length; i++){
                for(int j=0; j<population.length; j++){
                        s+=" " + nachbarn(i, j);
                }
                s+="\n";
            }
            System.out.println(s);
    }

    public int nachbarn( int i,int j ){
        int counter = 0;
        for(int a = -1; a<=1; a++){
            for(int b = -1; b<=1; b++){
                if(a==0 && b==0){
                    continue;
                }
                if(inbounds(i+a, j+b)){
                    if(population[i+a][j+b]){
                        counter++;
                    }
                }
            }
        }
    return counter;
    }

    public boolean inbounds(int i,int j){
        return (i>=0 && i<population.length) && (j>=0 && j<population.length);
    }
}
