/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import thegame.domain.Brick;

/**
 *
 * @author afellman
 */
public class BrickTest {

    Brick brick;

    public BrickTest() {
    }

    @Before
    public void setUp() {
        brick = new Brick(1);
    }

    @Test
    public void BrickValueGivesCorrect() {
        assertEquals(1, brick.getValue());
    }

    @Test
    public void BrickToStringCorrect() {
        assertEquals("Value of the Brick: 1", brick.toString());
    }
    @Test
    public void BrickChangeValueWorks() {
        brick.changeValue(16);
        assertEquals(16, brick.getValue());
    }
    
    @Test
    public void BrickSetLocationWorks() {
        brick.setLocation(2, 1);
        assertEquals(2, brick.getLanenum());
        assertEquals(1, brick.getIndex());
    }
    
    @Test
    public void BrickSetLanenumWorks() {
        brick.setLanenum(1);
        assertEquals(1, brick.getLanenum());
    }
    
     @Test
    public void BrickSetIndexWorks() {
        brick.setIndex(1);
        assertEquals(1, brick.getIndex());
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
