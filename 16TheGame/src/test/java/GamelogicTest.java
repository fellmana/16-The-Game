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
import thegame.logic.Gamelogic;

/**
 *
 * @author afellman
 */
public class GamelogicTest {
    Gamelogic logic;
    public GamelogicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        logic = new Gamelogic();
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void initialMovesMadeZero(){
        assertEquals(0, logic.getMovesMade());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
