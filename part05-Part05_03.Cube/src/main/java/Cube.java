/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
public class Cube {

    private int a;

    public Cube(int edgeLength) {
        this.a = edgeLength;
    }

    public int volume() {
        return this.a * this.a * this.a;
    }

    public String toString() {
       return "The length of the edge is " + this.a + " and the volume " + this.volume();
    }

}
