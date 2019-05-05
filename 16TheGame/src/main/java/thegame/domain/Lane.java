package thegame.domain;

import java.util.ArrayList;


/**
 * Abstraction class for functionality of lane and piles.
 * @author afellman
 */
public class Lane {

    private ArrayList<Brick> bricks;

    public Lane() {
        this.bricks = new ArrayList<>();
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }
    
    
    /**
     * Initialize lane from list of bricks.
     * @param list 
     */
    public void initBricks(ArrayList<Brick> list) {
        this.bricks = list;
    }
   

    /**
     * Add brick to lane.
     *
     * @param b
     */
    public void addBrick(Brick b) {
        bricks.add(b);
    }

    public Integer getLength() {
        return bricks.size();
    }

    
    /**
     * Displays readable information on Lane properties.
     * @return 
     */
    public boolean printLane() {
        if (this.bricks.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.bricks.size(); i++) {
            Brick b = bricks.get(i);
            System.out.println(b.toString() + ", Location: Lane: " + b.getLanenum() + ", index: " + b.getIndex());

        }
        return true;
    }
    
    
    /**
     * toString formatting used in save game state
     * @return 
     */
    public String toString() {
        String outstring = "";
        for (int i = 0; i < bricks.size(); i++) {
            outstring += bricks.get(i).getValue() + " ";
        }
        return outstring;
    }

}
