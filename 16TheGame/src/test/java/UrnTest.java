/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        urn.InitializeUrn();
        assertEquals(96, urn.getLength());
    }

    @Test
    public void UrnDrawReducesAmount() {
        urn.InitializeUrn();
        urn.draw();
        assertEquals(95, urn.getLength());
    }
    
    @Test
    public void UrnDrawGivesABrick(){
        urn.InitializeUrn();
        Brick b =  urn.draw();
        assertNotEquals(null, b);
    }
    

}
