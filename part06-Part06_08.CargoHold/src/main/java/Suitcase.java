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

public class Suitcase {

    private ArrayList<Item> list;
    private int w;

    public Suitcase(int max) {
        this.w = max;
        this.list = new ArrayList<>();
    }

    public void addItem(Item item) {
        int t = 0;
        for (Item i : list) {
            t += i.getWeight();
        }
        if (item.getWeight() + t <= this.w) {
            this.list.add(item);
        }
    }

    public String toString() {
        int t = 0;
        for (Item i : list) {
            t += i.getWeight();
        }
        if (this.list.size()==0) {
            return "no items (" + t + " kg)";
        }else if(this.list.size()==1){
            return "1 item (" + t + " kg)";
        }else{
            return this.list.size()+" items (" + t + " kg)";
        }
    }
    
    public void printItems(){
        for(Item i:list){
        System.out.println(i.getName()+" ("+i.getWeight()+" kg)");
        }
    }
    
    public int totalWeight(){
         int t = 0;
        for (Item i : list) {
            t += i.getWeight();
        }
        return t;
    }
    
    public Item heaviestItem(){
        if(this.list.isEmpty()){
           return null;
        }
        Item h=this.list.get(0);
        for(Item i:list){
            if(i.getWeight()>h.getWeight()){
                h=i;
            }
        }
        return h;
    }
    
    

}
