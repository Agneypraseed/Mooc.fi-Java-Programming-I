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

public class Hold {

    private int max;
    private ArrayList<Suitcase> luguagge;

    public Hold(int m) {
        this.max = m;
        this.luguagge = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int t = 0;
        for (Suitcase i : luguagge) {
            t += i.totalWeight();
        }
        if (suitcase.totalWeight() + t <= this.max) {
            this.luguagge.add(suitcase);
        }
    }

    public String toString() {
        int t = 0;
        for (Suitcase i : luguagge) {
            t += i.totalWeight();
        }
        return this.luguagge.size() + " suitcases(" + t + " kg)";
    }

    public void printItems() {
        for (Suitcase i : luguagge) {
            i.printItems();
        }
    }

}
