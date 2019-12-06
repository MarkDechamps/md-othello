package be.dechamps.model;


import be.dechamps.web.OthelloRestcontroller;
import org.junit.Test;

public class OthelloEngineTest {

    @Test
    public void startup() {
        OthelloEngine engine = new OthelloEngine();
        engine.thinkAndMove();
        String s = engine.getCurrentPosition().toGraphString();
        System.out.println(s);
    }
    @Test
    public void fakeMove(){
        OthelloRestcontroller controller = new OthelloRestcontroller();

        OthelloEngine engine = new OthelloEngine();
        engine.restart();
        controller.moveFake(1, 1, engine);
    }
}