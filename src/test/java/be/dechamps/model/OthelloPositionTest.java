package be.dechamps.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class OthelloPositionTest {


  @Test
  public void parseString() {
    OthelloEngine engine = new OthelloEngine();
    engine.restart();
    engine.thinkAndMove();

    OthelloPosition cur = engine.getCurrentPosition();
    String curString = cur.getPositionString();
    OthelloPosition newPos = new OthelloPosition(curString);
    assertEquals(curString, newPos.getPositionString());

  }

}
