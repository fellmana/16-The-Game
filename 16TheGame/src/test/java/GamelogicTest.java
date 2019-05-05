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
    public void initialMovesMadeZero() {
        assertEquals(0, logic.getMovesMade());
    }

    @Test
    public void checkWinFailsOnPile1() {
        logic.getPile1().addBrick(new Brick(0));
        assertEquals(false, logic.checkWin());
    }

    @Test
    public void checkWinFailsOnPile2() {
        logic.getPile1().addBrick(new Brick(16));
        logic.getPile2().addBrick(new Brick(0));
        assertEquals(false, logic.checkWin());
    }

    @Test
    public void checkWinFailsOnPile3() {
        logic.getPile1().addBrick(new Brick(16));
        logic.getPile2().addBrick(new Brick(16));
        logic.getPile3().addBrick(new Brick(0));
        assertEquals(false, logic.checkWin());
    }

    @Test
    public void checkWinFailsOnPile4() {
        logic.getPile1().addBrick(new Brick(16));
        logic.getPile2().addBrick(new Brick(16));
        logic.getPile3().addBrick(new Brick(16));
        logic.getPile4().addBrick(new Brick(0));
        assertEquals(false, logic.checkWin());
    }

    @Test
    public void checkWinFailsOnPile5() {
        logic.getPile1().addBrick(new Brick(16));
        logic.getPile2().addBrick(new Brick(16));
        logic.getPile3().addBrick(new Brick(16));
        logic.getPile4().addBrick(new Brick(16));
        logic.getPile5().addBrick(new Brick(0));
        assertEquals(false, logic.checkWin());
    }

    @Test
    public void checkWinFailsOnPile6() {
        logic.getPile1().addBrick(new Brick(16));
        logic.getPile2().addBrick(new Brick(16));
        logic.getPile3().addBrick(new Brick(16));
        logic.getPile4().addBrick(new Brick(16));
        logic.getPile5().addBrick(new Brick(16));
        logic.getPile6().addBrick(new Brick(0));
        assertEquals(false, logic.checkWin());
    }

    @Test
    public void checkWinGetsWin() {
        logic.getPile1().addBrick(new Brick(16));
        logic.getPile2().addBrick(new Brick(16));
        logic.getPile3().addBrick(new Brick(16));
        logic.getPile4().addBrick(new Brick(16));
        logic.getPile5().addBrick(new Brick(16));
        logic.getPile6().addBrick(new Brick(16));
        assertEquals(true, logic.checkWin());
    }

    @Test
    public void grabSelectionLane1NotinorderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 1);
        logic.addToLane(new Brick(12), 1);
        logic.addToLane(new Brick(13), 1);
        Lane newlane = logic.grabSelection(1, 1);
        assertEquals(0, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane2NotinorderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 2);
        logic.addToLane(new Brick(12), 2);
        logic.addToLane(new Brick(13), 2);
        Lane newlane = logic.grabSelection(2, 1);
        assertEquals(0, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane3NotinorderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 3);
        logic.addToLane(new Brick(12), 3);
        logic.addToLane(new Brick(13), 3);
        Lane newlane = logic.grabSelection(3, 1);
        assertEquals(0, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane4NotinorderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 4);
        logic.addToLane(new Brick(12), 4);
        logic.addToLane(new Brick(13), 4);
        Lane newlane = logic.grabSelection(4, 1);
        assertEquals(0, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane1InOrderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 1);
        logic.addToLane(new Brick(13), 1);
        logic.addToLane(new Brick(12), 1);
        Lane newlane = logic.grabSelection(1, 1);
        assertEquals(3, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane2InOrderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 2);
        logic.addToLane(new Brick(13), 2);
        logic.addToLane(new Brick(12), 2);
        Lane newlane = logic.grabSelection(2, 1);
        assertEquals(3, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane3InOrderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 3);
        logic.addToLane(new Brick(13), 3);
        logic.addToLane(new Brick(12), 3);
        Lane newlane = logic.grabSelection(3, 1);
        assertEquals(3, newlane.getBricks().size());
    }

    @Test
    public void grabSelectionLane4InOrderGivesEmptyLane() {
        logic.addToLane(new Brick(14), 4);
        logic.addToLane(new Brick(13), 4);
        logic.addToLane(new Brick(12), 4);
        Lane newlane = logic.grabSelection(4, 1);
        assertEquals(3, newlane.getBricks().size());
    }

    @Test
    public void isMoveLegalLane1GivesTrueOnLegalMove() {
        logic.addToLane(new Brick(14), 1);
        logic.addToLane(new Brick(13), 1);
        logic.addToLane(new Brick(12), 1);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(true, logic.isMoveLegal(1));
    }

    @Test
    public void isMoveLegalLane1GivesFalseOnIllegalMove() {
        logic.addToLane(new Brick(14), 1);
        logic.addToLane(new Brick(13), 1);
        logic.addToLane(new Brick(12), 1);
        logic.getSelection().addBrick(new Brick(10));
        logic.getSelection().addBrick(new Brick(9));
        assertEquals(false, logic.isMoveLegal(1));
    }

    @Test
    public void isMoveLegalLane1GivesTrueOn16ToEmpty() {
        logic.getSelection().addBrick(new Brick(16));
        assertEquals(true, logic.isMoveLegal(1));
    }

    @Test
    public void isMoveLegalLane1GivesFalseOnNot16ToEmpty() {
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(false, logic.isMoveLegal(1));
    }

    @Test
    public void isMoveLegalLane2GivesTrueOnLegalMove() {
        logic.addToLane(new Brick(14), 2);
        logic.addToLane(new Brick(13), 2);
        logic.addToLane(new Brick(12), 2);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(true, logic.isMoveLegal(2));
    }

    @Test
    public void isMoveLegalLane2GivesFalseOnIllegalMove() {
        logic.addToLane(new Brick(14), 2);
        logic.addToLane(new Brick(13), 2);
        logic.addToLane(new Brick(12), 2);
        logic.getSelection().addBrick(new Brick(10));
        logic.getSelection().addBrick(new Brick(9));
        assertEquals(false, logic.isMoveLegal(2));
    }

    @Test
    public void isMoveLegalLane2GivesTrueOn16ToEmpty() {
        logic.getSelection().addBrick(new Brick(16));
        assertEquals(true, logic.isMoveLegal(2));
    }

    @Test
    public void isMoveLegalLane2GivesFalseOnNot16ToEmpty() {
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(false, logic.isMoveLegal(2));
    }

    @Test
    public void isMoveLegalLane3GivesTrueOnLegalMove() {
        logic.addToLane(new Brick(14), 3);
        logic.addToLane(new Brick(13), 3);
        logic.addToLane(new Brick(12), 3);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(true, logic.isMoveLegal(3));
    }

    @Test
    public void isMoveLegalLane3GivesFalseOnIllegalMove() {
        logic.addToLane(new Brick(14), 3);
        logic.addToLane(new Brick(13), 3);
        logic.addToLane(new Brick(12), 3);
        logic.getSelection().addBrick(new Brick(10));
        logic.getSelection().addBrick(new Brick(9));
        assertEquals(false, logic.isMoveLegal(3));
    }

    @Test
    public void isMoveLegalLane3GivesTrueOn16ToEmpty() {
        logic.getSelection().addBrick(new Brick(16));
        assertEquals(true, logic.isMoveLegal(3));
    }

    @Test
    public void isMoveLegalLane3GivesFalseOnNot16ToEmpty() {
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(false, logic.isMoveLegal(3));
    }

    @Test
    public void isMoveLegalLane4GivesTrueOnLegalMove() {
        logic.addToLane(new Brick(14), 4);
        logic.addToLane(new Brick(13), 4);
        logic.addToLane(new Brick(12), 4);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(true, logic.isMoveLegal(4));
    }

    @Test
    public void isMoveLegalLane4GivesFalseOnIllegalMove() {
        logic.addToLane(new Brick(14), 4);
        logic.addToLane(new Brick(13), 4);
        logic.addToLane(new Brick(12), 4);
        logic.getSelection().addBrick(new Brick(10));
        logic.getSelection().addBrick(new Brick(9));
        assertEquals(false, logic.isMoveLegal(4));
    }

    @Test
    public void isMoveLegalLane4GivesTrueOn16ToEmpty() {
        logic.getSelection().addBrick(new Brick(16));
        assertEquals(true, logic.isMoveLegal(4));
    }

    @Test
    public void isMoveLegalLane4GivesFalseOnNot16ToEmpty() {
        logic.getSelection().addBrick(new Brick(10));
        assertEquals(false, logic.isMoveLegal(4));
    }

    @Test
    public void isMoveLegalNonExistingLaneChosen() {
        assertEquals(false, logic.isMoveLegal(5));
    }

    @Test
    public void deleteFromLaneReducesAmmountofBricksInLane1() {
        logic.addToLane(new Brick(14), 1);
        logic.addToLane(new Brick(13), 1);
        logic.addToLane(new Brick(12), 1);
        logic.getSelection().addBrick(new Brick(13));
        logic.getSelection().addBrick(new Brick(12));
        logic.deleteFromLane(1);
        assertEquals(1, logic.getLane(1).getBricks().size());
    }

    @Test
    public void deleteFromLaneReducesAmmountofBricksInLane2() {
        logic.addToLane(new Brick(14), 2);
        logic.addToLane(new Brick(13), 2);
        logic.addToLane(new Brick(12), 2);
        logic.getSelection().addBrick(new Brick(13));
        logic.getSelection().addBrick(new Brick(12));
        logic.deleteFromLane(2);
        assertEquals(1, logic.getLane(2).getBricks().size());
    }

    @Test
    public void deleteFromLaneReducesAmmountofBricksInLane3() {
        logic.addToLane(new Brick(14), 3);
        logic.addToLane(new Brick(13), 3);
        logic.addToLane(new Brick(12), 3);
        logic.getSelection().addBrick(new Brick(13));
        logic.getSelection().addBrick(new Brick(12));
        logic.deleteFromLane(3);
        assertEquals(1, logic.getLane(3).getBricks().size());
    }

    @Test
    public void deleteFromLaneReducesAmmountofBricksInLane4() {
        logic.addToLane(new Brick(14), 4);
        logic.addToLane(new Brick(13), 4);
        logic.addToLane(new Brick(12), 4);
        logic.getSelection().addBrick(new Brick(13));
        logic.getSelection().addBrick(new Brick(12));
        logic.deleteFromLane(4);
        assertEquals(1, logic.getLane(4).getBricks().size());
    }

    @Test
    public void addSelectionToLaneIncreasesTheAmmountofBricksInLane1() {
        logic.addToLane(new Brick(14), 1);
        logic.addToLane(new Brick(13), 1);
        logic.addToLane(new Brick(12), 1);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        logic.addSelectionToLane(1);
        assertEquals(5, logic.getLane(1).getBricks().size());
    }

    @Test
    public void addSelectionToLaneIncreasesTheAmmountofBricksInLane2() {
        logic.addToLane(new Brick(14), 2);
        logic.addToLane(new Brick(13), 2);
        logic.addToLane(new Brick(12), 2);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        logic.addSelectionToLane(2);
        assertEquals(5, logic.getLane(2).getBricks().size());
    }

    @Test
    public void addSelectionToLaneIncreasesTheAmmountofBricksInLane3() {
        logic.addToLane(new Brick(14), 3);
        logic.addToLane(new Brick(13), 3);
        logic.addToLane(new Brick(12), 3);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        logic.addSelectionToLane(3);
        assertEquals(5, logic.getLane(3).getBricks().size());
    }

    @Test
    public void addSelectionToLaneIncreasesTheAmmountofBricksInLane4() {
        logic.addToLane(new Brick(14), 4);
        logic.addToLane(new Brick(13), 4);
        logic.addToLane(new Brick(12), 4);
        logic.getSelection().addBrick(new Brick(11));
        logic.getSelection().addBrick(new Brick(10));
        logic.addSelectionToLane(4);
        assertEquals(5, logic.getLane(4).getBricks().size());
    }

    @Test
    public void ArePileMovesCorrectLegalMoves() {
        logic.getPile1().addBrick(new Brick(1));
        logic.getPile2().addBrick(new Brick(1));
        logic.getPile3().addBrick(new Brick(1));
        logic.getPile4().addBrick(new Brick(1));
        logic.getPile5().addBrick(new Brick(1));
        logic.getPile6().addBrick(new Brick(1));
        logic.getSelection().addBrick(new Brick(2));
        for (int i = 1; i < 7; i++) {
            assertEquals(true, logic.isPileMoveLegal(i));
        }

    }
    
     @Test
    public void isPileMovesLegalGivesFalseOnIllegalMoves() {
        logic.getPile1().addBrick(new Brick(1));
        logic.getPile2().addBrick(new Brick(1));
        logic.getPile3().addBrick(new Brick(1));
        logic.getPile4().addBrick(new Brick(1));
        logic.getPile5().addBrick(new Brick(1));
        logic.getPile6().addBrick(new Brick(1));
        logic.getSelection().addBrick(new Brick(3));
        for (int i = 1; i < 7; i++) {
            assertEquals(false, logic.isPileMoveLegal(i));
        }

    }

}
