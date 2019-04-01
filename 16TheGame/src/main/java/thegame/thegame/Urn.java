/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame.thegame;
import java.util.ArrayList;
/**
 *
 * @author afellman
 */
public class Urn {
    private ArrayList<Brick> Bricks;
    
    public Urn(){
        this.Bricks = new ArrayList<>();
    }
    
    public void InitializeUrn(){
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 6; j++) {
               this.Bricks.add(new Brick(i));
            }
        }
    }
    
    public int getLength(){
        return this.Bricks.size();
    }
    
    public Brick Draw(){
        int randomNum = 1 + (int)(Math.random()*this.getLength()); 
        Brick chosen = Bricks.get(randomNum);
        Bricks.remove(randomNum);
        return chosen;
    }
    
    
    //
    //      Add load method to initialize from file
    //
    
    
    public String toString(){
        String result = "";
        for (Brick B : Bricks) {
            result += (B.getValue() + ", "); 
        }
        return result;
    }
    
    
}
