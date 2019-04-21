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

    public ArrayList<Brick> getBricks(Integer a, Integer b) {
        ArrayList<Brick> out = new ArrayList<>();
        for (int i = a; i < b; i++) {
            out.add(bricks.get(i));
        }
        return out;
    }

    public void initBricks(ArrayList<Brick> list) {
        this.bricks = list;
    }

    public void addBrick(Brick b) {
        bricks.add(b);
    }

    public Integer getLength() {
        return bricks.size();
    }

    public void printLane() {
        for (int i = 0; i < this.bricks.size(); i++) {
            Brick b = bricks.get(i);
            System.out.println(b.toString() + ", Location: Lane: " + b.getLanenum() + ", index: " + b.getIndex());

        }
    }

    public void removeBrick(Integer index) {
        bricks.remove(index);
    }

}
