/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.logic;

import java.util.ArrayList;
import thegame.domain.Brick;
import thegame.domain.Lane;
import thegame.domain.Urn;

/**
 * Define Game logic and lane selection
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
    Lane pile1;
    Lane pile2;
    Lane pile3;
    Lane pile4;
    Lane pile5;
    Lane pile6;
    int movesMade;

    public int getMovesMade() {
        return movesMade;
    }

    /**
     * Increments number of moves played.
     */
    public void incrementMovesMade() {
        this.movesMade += 1;
    }

    public Lane getPile1() {
        return pile1;
    }

    public Lane getPile2() {
        return pile2;
    }

    public Lane getPile3() {
        return pile3;
    }

    public Lane getPile4() {
        return pile4;
    }

    public void setUrn(ArrayList<Integer> lst) {
        Urn nurn = new Urn();
        nurn.loadUrn(lst);
        this.urn = nurn;
    }

    public Urn getUrn() {
        return urn;
    }

    public void setMovesMade(int movesMade) {
        this.movesMade = movesMade;
    }

    public Lane getPile5() {
        return pile5;
    }

    public Lane getPile6() {
        return pile6;
    }

    public Gamelogic() {
        lane1 = new Lane();
        lane2 = new Lane();
        lane3 = new Lane();
        lane4 = new Lane();
        selection = new Lane();
        urn = new Urn();
        pile1 = new Lane();
        pile2 = new Lane();
        pile3 = new Lane();
        pile4 = new Lane();
        pile5 = new Lane();
        pile6 = new Lane();
        pile1.addBrick(new Brick(0));
        pile2.addBrick(new Brick(0));
        pile3.addBrick(new Brick(0));
        pile4.addBrick(new Brick(0));
        pile5.addBrick(new Brick(0));
        pile6.addBrick(new Brick(0));
        movesMade = 0;

    }

    /**
     * Add given brick to given lane(n).
     *
     * @param b
     * @param n
     */
    public void addToLane(Brick b, Integer n) {
        if (null == n) {
            lane4.addBrick(b);
        } else {
            switch (n) {
                case 1:
                    lane1.addBrick(b);
                    break;
                case 2:
                    lane2.addBrick(b);
                    break;
                case 3:
                    lane3.addBrick(b);
                    break;
                default:
                    lane4.addBrick(b);
                    break;
            }
        }
    }

    /**
     * Chose a lane to clear Clearing means that it creates new empty ArrayList
     * to bricks.
     *
     * @param n
     */
    public void clearLane(Integer n) {
        if (null == n) {
            lane4.initBricks(new ArrayList<>());
        } else {
            switch (n) {
                case 1:
                    lane1.initBricks(new ArrayList<>());
                    break;
                case 2:
                    lane2.initBricks(new ArrayList<>());
                    break;
                case 3:
                    lane3.initBricks(new ArrayList<>());
                    break;
                default:
                    lane4.initBricks(new ArrayList<>());
                    break;
            }
        }
    }

    /**
     * Grab a new selection and make it the current selection.
     *
     * @param lanenbr
     * @param index
     */
    public void updateSelectionFromLane(Integer lanenbr, Integer index) {
        this.selection = grabSelection(lanenbr, index);
    }

    /**
     * Checks if the bricks are in order, if they are the selection is valid.
     *
     * @param sel
     * @return
     */
    public Boolean isSelectionValid(Lane sel) {
        Integer prev = sel.getBricks().get(0).getValue();
        for (int i = 1; i < sel.getLength(); i++) {
            Integer currentValue = sel.getBricks().get(i).getValue();
            if (currentValue == prev - 1) {
                continue;
            } else {
                System.out.println("Selection not Valid");
                return false;
            }
        }
        System.out.println("Selection Valid");
        return true;
    }

    /**
     * Hard set given bricks as current selection.
     *
     * @param b
     */
    public void setSelection(Brick b) {
        selection.initBricks(new ArrayList<>());
        selection.addBrick(b);
    }

    /**
     * Selects bricks on the basis of given lane and index in given lane.
     *
     * @param lanenbr
     * @param n
     * @return
     */
    public Lane grabSelection(Integer lanenbr, Integer n) {
        ArrayList<Brick> temp = new ArrayList<>();
        if (lanenbr == 1) {
            System.out.println("Chosen Lane: Lane 1");
            System.out.println("Chosen Lane Number of Bricks: "
                    + lane1.getLength());
            for (int i = n; i <= lane1.getLength() - 1; i++) {
                if (lane1.getBricks().get(i - 1).getValue() == lane1.getBricks()
                        .get(i).getValue() + 1) {
                    continue;
                } else {
                    System.out.println("Bricks not in order");
                    Lane templane = new Lane();
                    templane.initBricks(temp);
                    return templane;

                }
            }
            System.out.println("Bricks in order");
            for (int i = n; i <= lane1.getLength(); i++) {
                temp.add(lane1.getBricks().get(i - 1));
            }
        }
        if (lanenbr == 2) {
            System.out.println("Chosen Lane: Lane 2");
            System.out.println("Chosen Lane Number of Bricks: "
                    + lane2.getLength());
            for (int i = n; i <= lane2.getLength() - 1; i++) {
                if (lane2.getBricks().get(i - 1).getValue() == lane2.getBricks()
                        .get(i).getValue() + 1) {
                    continue;
                } else {
                    System.out.println("Bricks not in order");
                    Lane templane = new Lane();
                    templane.initBricks(temp);
                    return templane;

                }
            }
            System.out.println("Bricks in order");
            for (int i = n; i <= lane2.getLength(); i++) {
                temp.add(lane2.getBricks().get(i - 1));
            }
        }
        if (lanenbr == 3) {
            System.out.println("Chosen Lane: Lane 3");
            System.out.println("Chosen Lane Number of Bricks: "
                    + lane3.getLength());
            for (int i = n; i <= lane3.getLength() - 1; i++) {
                if (lane3.getBricks().get(i - 1).getValue() == lane3.getBricks()
                        .get(i).getValue() + 1) {
                    continue;
                } else {
                    System.out.println("Bricks not in order");
                    Lane templane = new Lane();
                    templane.initBricks(temp);
                    return templane;

                }
            }
            System.out.println("Bricks in order");
            for (int i = n; i <= lane3.getLength(); i++) {
                temp.add(lane3.getBricks().get(i - 1));
            }
        }
        if (lanenbr == 4) {
            System.out.println("Chosen Lane: Lane 3");
            System.out.println("Chosen Lane Number of Bricks: "
                    + lane4.getLength());
            for (int i = n; i <= lane4.getLength() - 1; i++) {
                if (lane4.getBricks().get(i - 1).getValue() == lane4.getBricks()
                        .get(i).getValue() + 1) {
                    continue;
                } else {
                    System.out.println("Bricks not in order");
                    Lane templane = new Lane();
                    templane.initBricks(temp);
                    return templane;

                }
            }
            System.out.println("Bricks in order");
            for (int i = n; i <= lane4.getLength(); i++) {
                temp.add(lane4.getBricks().get(i - 1));
            }
        }
        Lane templane = new Lane();
        templane.initBricks(temp);
        return templane;
    }

    public Lane getSelection() {
        return this.selection;
    }

    /**
     * More convenient getter for lane selection.
     *
     * @param n
     * @return
     */
    public Lane getLane(Integer n) {
        if (null != n) {
            switch (n) {
                case 1:
                    return lane1;
                case 2:
                    return lane2;
                case 3:
                    return lane3;
                case 4:
                    return lane4;
                default:
                    break;
            }
        }
        return lane1;
    }

    /**
     * Delete selection from given lane.
     *
     * @param n
     */
    public void deleteFromLane(Integer n) {
        if (n == 1) {
            Integer nRemoves = selection.getLength();
            Lane temp = new Lane();

            for (int i = 0; i < lane1.getLength() - nRemoves; i++) {
                temp.addBrick(lane1.getBricks().get(i));
                System.out.println("Adding to lane1");
            }
            lane1 = temp;
            lane1.printLane();
        }
        if (n == 2) {
            Integer nRemoves = selection.getLength();
            Lane temp = new Lane();

            for (int i = 0; i < lane2.getLength() - nRemoves; i++) {
                temp.addBrick(lane2.getBricks().get(i));
            }
            lane2 = temp;
            lane2.printLane();
        }
        if (n == 3) {
            Integer nRemoves = selection.getLength();
            Lane temp = new Lane();

            for (int i = 0; i < lane3.getLength() - nRemoves; i++) {
                temp.addBrick(lane3.getBricks().get(i));
            }
            lane3 = temp;
            lane3.printLane();
        }
        if (n == 4) {
            Integer nRemoves = selection.getLength();
            Lane temp = new Lane();

            for (int i = 0; i < lane4.getLength() - nRemoves; i++) {
                temp.addBrick(lane4.getBricks().get(i));
            }
            lane4 = temp;
            lane4.printLane();
        }
    }

    /**
     * Chose lane to which the selection is added.
     *
     * @param toLane
     */
    public void addSelectionToLane(Integer toLane) {
        if (toLane == 1) {
            for (int i = 0; i < selection.getLength(); i++) {
                Brick b = selection.getBricks().get(i);
                lane1.addBrick(b);
            }
        }
        if (toLane == 2) {
            for (int i = 0; i < selection.getLength(); i++) {
                Brick b = selection.getBricks().get(i);
                lane2.addBrick(b);
            }
        }
        if (toLane == 3) {
            for (int i = 0; i < selection.getLength(); i++) {
                Brick b = selection.getBricks().get(i);
                lane3.addBrick(b);
            }
        }
        if (toLane == 4) {
            for (int i = 0; i < selection.getLength(); i++) {
                Brick b = selection.getBricks().get(i);
                lane4.addBrick(b);
            }
        }
    }

    /**
     * Check if move between pile(n) and selection is legal.
     *
     * @param n
     * @return
     */
    public boolean isPileMoveLegal(Integer n) {
        int finval = selection.getBricks().get(selection.getLength() - 1).getValue();
        if (n == 1) {
            if (finval == pile1.getBricks().get(pile1.getLength() - 1).getValue() + 1) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 2) {
            if (finval == pile2.getBricks().get(pile2.getLength() - 1).getValue() + 1) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 3) {
            if (finval == pile3.getBricks().get(pile3.getLength() - 1).getValue() + 1) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 4) {
            if (finval == pile4.getBricks().get(pile4.getLength() - 1).getValue() + 1) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 5) {
            if (finval == pile5.getBricks().get(pile5.getLength() - 1).getValue() + 1) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 6) {
            if (finval == pile6.getBricks().get(pile6.getLength() - 1).getValue() + 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Check if the move between given lane(n) and selection is Legal.
     *
     * @param n
     * @return
     */
    public boolean isMoveLegal(Integer n) {
        if (n == 1) {
            int firstInSelection = selection.getBricks().get(0).getValue();
            if (lane1.getBricks().isEmpty()) {
                if (firstInSelection == 16) {
                    return true;
                } else {
                    return false;
                }
            }
            int lastInLane = lane1.getBricks().get(lane1.getLength() - 1)
                    .getValue();
            if (firstInSelection == (lastInLane - 1)) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 2) {
            int firstInSelection = selection.getBricks().get(0).getValue();
            if (lane2.getBricks().isEmpty()) {
                if (firstInSelection == 16) {
                    return true;
                } else {
                    return false;
                }

            }
            int lastInLane = lane2.getBricks().get(lane2.getLength() - 1)
                    .getValue();
            if (firstInSelection == (lastInLane - 1)) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 3) {
            int firstInSelection = selection.getBricks().get(0).getValue();
            if (lane3.getBricks().isEmpty()) {
                if (firstInSelection == 16) {
                    return true;
                } else {
                    return false;
                }

            }
            int lastInLane = lane3.getBricks().get(lane3.getLength() - 1)
                    .getValue();
            if (firstInSelection == (lastInLane - 1)) {
                return true;
            } else {
                return false;
            }
        }
        if (n == 4) {
            int firstInSelection = selection.getBricks().get(0).getValue();
            if (lane4.getBricks().isEmpty()) {
                if (firstInSelection == 16) {
                    return true;
                } else {
                    return false;
                }

            }
            int lastInLane = lane4.getBricks().get(lane4.getLength() - 1)
                    .getValue();
            if (firstInSelection == (lastInLane - 1)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Check if win condition is met.
     *
     * @return
     */
    public boolean checkWin() {
        if (pile1.getBricks().get(pile1.getLength() - 1).getValue() != 16) {
            return false;
        } else if (pile2.getBricks().get(pile2.getLength() - 1)
                .getValue() != 16) {
            return false;
        } else if (pile3.getBricks().get(pile3.getLength() - 1)
                .getValue() != 16) {
            return false;
        } else if (pile4.getBricks().get(pile4.getLength() - 1)
                .getValue() != 16) {
            return false;
        } else if (pile5.getBricks().get(pile5.getLength() - 1)
                .getValue() != 16) {
            return false;
        } else if (pile6.getBricks().get(pile6.getLength() - 1)
                .getValue() != 16) {
            return false;
        }
        System.out.println("YOU WIN");
        return true;
    }

    public void printSelection() {
        selection.printLane();
    }

}
