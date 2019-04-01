/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.thegame;

/**
 *
 * @author afellman
 */
public class Brick {
    private int value;
    
    public Brick(int val){
        this.value = val; 
    }
    
    public int getValue(){
        return value;
    }
    
    public String toString(){
        return  "Value of the Brick: " + value;
    }
    
}
