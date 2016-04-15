package jLife2_0;

/**
 * Created by .Rain on 06.04.2016.
 */
public class Field {
    Field(final  int SIZE){
        Generation    gen    = new Generation(SIZE, SIZE);
        Gui           gui    = new Gui(SIZE);
        do {
            gui.reDraw(gen.stateMatrix());
        }while(true);
    }
}
