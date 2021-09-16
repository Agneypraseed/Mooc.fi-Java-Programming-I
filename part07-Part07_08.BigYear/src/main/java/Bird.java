/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
import java.util.ArrayList;

public class Bird {

    private String name;
    private String latin;
    private int count;

    public Bird(String n, String l) {
        this.name = n;
        this.latin = l;
        this.count = 0;
    }

    public void add() {
        this.count++;
    }

    public boolean check(String n) {
        if(this.name.equals(n)) {
            return true;
        } else {
            return false;    
        }
    }
    
    
    public String toString(){
        return this.name+" ("+this.latin+"): "+this.count+" observations";
    }
    
    
    
    
    
}
