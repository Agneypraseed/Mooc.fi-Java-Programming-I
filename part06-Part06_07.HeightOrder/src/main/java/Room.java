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

public class Room {

    private ArrayList<Person> p;

    public Room() {
        this.p = new ArrayList<>();
    }

    public void add(Person person) {
        this.p.add(person);
    }

    public boolean isEmpty() {
        if (this.p.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.p;
    }

    public Person shortest() {
        if (this.p.isEmpty()) {
            return null;
        }
        Person s = this.p.get(0);

        for (Person l : p) {
            if (l.getHeight() < s.getHeight()) {
                s = l;
            }
        }
        return s;
    }

    public Person take(){
        if (this.p.isEmpty()) {
            return null;
        }
        Person s = this.p.get(0);

        for (Person l : p) {
            if (l.getHeight() < s.getHeight()) {
                s = l;
            }
        }
        p.remove(s);
        return s;
        
        
    }
    
    
    
    
    
    
}
