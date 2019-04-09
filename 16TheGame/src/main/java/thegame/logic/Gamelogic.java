/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.logic;

import com.sun.org.apache.bcel.internal.generic.L2D;
import java.util.ArrayList;
import thegame.domain.Brick;
import thegame.domain.Lane;
import thegame.domain.Urn;

/**
 *
 * @author afellman
 */
public class Gamelogic {

    Lane lane1;
    Lane lane2;
    Lane lane3;
    Lane lane4;
    Lane selection;
    Urn urn;

    public Gamelogic() {
        lane1 = new Lane();
        lane2 = new Lane();
        lane3 = new Lane();
        lane4 = new Lane();
        selection = new Lane();
        urn = new Urn();
    }

    public void updateCurrentSelection(Lane sel) {
        selection = sel;
    }

    public void addToLane(Lane sel, Integer n) {
        if (null == n) {
            for (int i = 0; i < sel.getLength(); i++) {
                lane4.addBrick(sel.getBricks().get(i));
            }
        } else {
            switch (n) {
                case 1:
                    for (int i = 0; i < sel.getLength(); i++) {
                        lane1.addBrick(sel.getBricks().get(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i < sel.getLength(); i++) {
                        lane2.addBrick(sel.getBricks().get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < sel.getLength(); i++) {
                        lane3.addBrick(sel.getBricks().get(i));
                    }
                    break;
                default:
                    for (int i = 0; i < sel.getLength(); i++) {
                        lane4.addBrick(sel.getBricks().get(i));
                    }
                    break;
            }
        }
    }

    public Boolean isSelectionValid(Lane sel) {
        Integer prev = sel.getBricks().get(0).getValue();
        for (int i = 1; i < sel.getLength(); i++) {
            Integer currentValue = sel.getBricks().get(i).getValue();
            if (currentValue == prev - 1) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public Lane grabSelection(Lane sel, Integer n) {
        Lane outlane = new Lane();
        if (isSelectionValid(sel) == true) {
            if (null == n) {
                System.out.println("No Lane Chosen");
            } else {
                switch (n) {
                    case 1:
                        outlane.initBricks(lane1.getBricks(lane1.getLength()-sel.getLength(),lane1.getLength()));
                        break;
                    case 2:
                        outlane.initBricks(lane2.getBricks(lane2.getLength()-sel.getLength(),lane2.getLength()));
                        break;
                    case 3:
                        outlane.initBricks(lane3.getBricks(lane3.getLength()-sel.getLength(),lane3.getLength()));
                        break;
                    default:
                        outlane.initBricks(lane4.getBricks(lane4.getLength()-sel.getLength(),lane4.getLength()));
                        break;
                }
            }
        }
        return outlane;
    }

}
