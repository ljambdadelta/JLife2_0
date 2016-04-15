package jLife2_0;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Created by .Rain on 06.04.2016.
 */
public class Gui {

    final  double    WIDTH;
    final  double    LENGTH;
    final  double    SCALE_MAX_RANGE;
    final  double    SCALE_MAX_ID;
    final  double    SCALE_STEP_SIZE;

    Gui(int size){

        WIDTH               = 800.00;
        LENGTH              = 800.00;
        SCALE_MAX_RANGE     = 20;
        SCALE_MAX_ID        = size;
        SCALE_STEP_SIZE     = SCALE_MAX_RANGE / SCALE_MAX_ID;

        StdDraw.setCanvasSize((int) WIDTH, (int) LENGTH);
        StdDraw.setXscale(0.00, 10.00);
        StdDraw.setYscale(0.00, 10.00);
        StdDraw.setPenRadius(0.0025);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);

        //testDraw();
        drawGrid();
    }

    private void testDraw(){
        StdDraw.line(0.00, 5.00, 10.00, 5.00);
    }


    private void drawGrid(){
        for (int i = 0; i <=  SCALE_MAX_ID; i++){
//            if(i == 1){
//                StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
//                StdDraw.line( 0.00, i * SCALE_STEP_SIZE, 10.00, i * SCALE_STEP_SIZE);
//                StdDraw.setPenColor(StdDraw.BOOK_RED);
//                continue;
//            }
            StdDraw.line(0.00, i * SCALE_STEP_SIZE, 10.00, i * SCALE_STEP_SIZE);
        }
        for (int j = 0; j <= SCALE_MAX_ID; j++){
//            if(j == 1){                               // Horizontal
//                StdDraw.setPenColor(StdDraw.BOOK_RED);
//                StdDraw.line(j * SCALE_STEP_SIZE, 0.00, j * SCALE_STEP_SIZE, 10.00);
//                StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
//                continue;
//            }
            StdDraw.line(j * SCALE_STEP_SIZE, 0.00, j * SCALE_STEP_SIZE, 10.00);
        }
    }

    public void reDraw(int[][] a){
        StdDraw.clear();
        drawGrid();
        // TODO: Draw Logic
    }
}
