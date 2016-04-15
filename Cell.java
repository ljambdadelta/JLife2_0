package jLife2_0;

/**
 * Created by .Rain on 06.04.2016.
 */
public class Cell {

    final    int        X;
    final    int        Y;
    private  int        age;
    private  boolean    stateIsAlive;

    Cell(final int x, final int y){
        X            = x;
        Y            = y;
        age          = (int)(10*Math.random()%2);
        stateIsAlive = age > 0 ? true : false;
    }

    public boolean isAlive() { return stateIsAlive; }
    public int     getAge()  { return age; }
}
