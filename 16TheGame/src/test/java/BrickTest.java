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
    public void BrickValueGivesCorrect(){
      assertEquals(1, brick.getValue());  
    }
  
    
        @Test
    public void BrickToStringCorrect(){
      assertEquals("Value of the Brick: 1", brick.toString());  
    }
    
    public void BrickChangeValueWorks(){
        brick.changeValue(16);
        assertEquals(16,brick.getValue());
    }
    
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
