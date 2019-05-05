/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javafx.embed.swing.JFXPanel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import thegame.domain.Brick;
import thegame.domain.Urn;
import ui.Game;

/**
 *
 * @author afellman
 */
public class UrnTest {

    Urn urn;

    public UrnTest() {
    }

    @Before
    public void setUp() {
        //Set up javafx toolkit  essential that this is here
        new JFXPanel();
        urn = new Urn();
    }

    @Test
    public void UrnInitializationGivesRightAmountOfBricks() {
        urn.initializeUrn();
        assertEquals(96, urn.getLength());
    }

    @Test
    public void UrnDrawReducesAmount() {
        urn.initializeUrn();
        urn.draw();
        assertEquals(95, urn.getLength());
    }

    @Test
    public void UrnDrawGivesABrick() {
        urn.initializeUrn();
        Brick b = urn.draw();
        assertNotEquals(null, b);
    }
    
    @Test
    public void LoadUrnAddsBrickToUrn() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        urn.loadUrn(lst);
        assertEquals(1,urn.getBricks().get(0).getValue());
    }

   

}
