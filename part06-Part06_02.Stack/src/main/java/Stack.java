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

public class Stack {

    private ArrayList<String> list;
    

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        if (this.isEmpty()) {
            this.list.add(value);
        } else {
            String [] t=new String[this.list.size()];
            int l=t.length;
            for(int i=0;i<this.list.size();i++){
                t[i]=this.list.get(i);
            }
            this.list.clear();
            this.list.add(value);
            for(int i=0;i<l;i++){
                this.list.add(t[i]);
            }
        }
    }

    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take(){
        String t=this.list.get(0);
        this.list.remove(0);
        return t;
    }
    
    
    
}
