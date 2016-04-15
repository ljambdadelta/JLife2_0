package jLife2_0;

/**
 * Created by .Rain on 06.04.2016.
 */
public class Generation {
    final    int   X_MAX;
    final    int   Y_MAX;
    private  Cell[][]    gameCell;
    Generation(int X_MAX, int Y_MAX){
        this.X_MAX  = X_MAX;
        this.Y_MAX  = Y_MAX;
        gameCell    = new Cell[X_MAX][Y_MAX];

        // First Generation
        for(int i = 0; i < X_MAX; i++){
            for(int j = 0; j < Y_MAX; j++){
                gameCell[i][j] = new Cell(i, j);
            }
        }
    }

    public int[][] stateMatrix(){
        int[][] result = new int [X_MAX][Y_MAX];
        for(int i = 0; i < X_MAX; i++){
            for(int j = 0; j < Y_MAX; j++){
                result[i][j] = gameCell[i][j].getAge();
            }
        }
        return result;
    }

    public void update(){
        //TODO: state update logic
    }
}
