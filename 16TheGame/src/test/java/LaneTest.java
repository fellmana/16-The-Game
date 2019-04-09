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
import thegame.domain.Lane;

/**
 *
 * @author afellman
 */
public class LaneTest {

    Lane lane;

    public LaneTest() {
    }

    @Before
    public void setUp() {
        lane = new Lane();
    }

    @Test
    public void InitialLaneEmpty() {
        assertEquals(0, lane.getBricks().size());
    }

    @Test
    public void AddBrickToLaneWorks() {
        Brick b = new Brick(1);
        lane.addBrick(b);
        assertEquals(b, lane.getBricks().get(0));
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
