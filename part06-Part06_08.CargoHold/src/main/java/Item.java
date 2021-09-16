/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
public class Item {

    private String name;
    private int weight;

    public Item(String name, int w) {
        this.name = name;
        this.weight = w;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {

        return this.name + " (" + this.weight + " kg)";

    }
    
    
    
    
    

}
