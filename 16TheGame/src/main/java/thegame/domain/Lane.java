package thegame.domain;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
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

}
