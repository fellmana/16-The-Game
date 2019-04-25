/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.domain;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author afellman
 */
public class Brick extends Button {
    
    private int value;
    private int lanenum;
    private int index;
    
    public Brick(int val) {
        this.value = val;
        String str = "";        
        this.setPrefHeight(80 * 0.8);
        this.setPrefWidth(80 * 0.8);
        this.setText(str);
        String file = "/b" + this.value + ".png";     
        ImageView img = new ImageView();
        img.setImage(new Image(getClass().getResourceAsStream(file)));
        img.setFitHeight(80 * 0.8);
        img.setFitWidth(80 * 0.8);
        super.setGraphic(img);
    }
    
    public void setLanenum(int lanenum) {
        this.lanenum = lanenum;
    }
    
   
    public void setIndex(int index) {
        this.index = index;
    }
    
    /**
     * Set the location of the brick, ie which lane it is in and on what index.
     * @param lanenum
     * @param ind 
     */
    public void setLocation(int lanenum, int ind) {
        this.lanenum = lanenum;
        this.index = ind;
    }
    
    public int getLanenum() {
        return lanenum;
    }
    
    public int getIndex() {
        return index;
    }
    
    public int getValue() {
        return value;
    }
    
    public String toString() {
        return "Value of the Brick: " + value;
    }
    
    public void changeValue(int val) {
        this.value = val;
    }
    
}
