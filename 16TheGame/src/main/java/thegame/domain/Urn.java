/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.domain;

import java.util.ArrayList;

/**
 * Gives the functionality of the Urn 
 * @author afellman
 */
public class Urn {

    private ArrayList<Brick> bricks;

    public Urn() {
        super();
        this.bricks = new ArrayList<>();
    }
    /**
     * Initialize urn with 96 brick from 1-16, 6 of each value.
     * 
     */
    public void InitializeUrn() {
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 6; j++) {
                this.bricks.add(new Brick(i));
            }
        }
    }

    public int getLength() {
        return this.bricks.size();
    }
    /**
     * Draw a random brick from the urn.
     * @return 
     */
    public Brick draw() {
        int randomNum = 0 + (int) (Math.random() * this.getLength());
        Brick chosen = bricks.get(randomNum);
        bricks.remove(randomNum);
        return chosen;
    }

    //
    //      Add load method to initialize from file
    //
    public String toString() {
        String result = "";
        for (Brick b : bricks) {
            result += (b.getValue() + ", ");
        }
        return result;
    }

}
