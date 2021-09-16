/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
public class Container {
    
    private int c;
    
    
    public Container(){
        this.c=0; 
    }
    
    public int contains() {
        return this.c;
    }
    
    public void add(int amount) {
        if(amount>0){
            if(this.c+amount<=100){
                this.c+=amount;
            }else{
                this.c=100;
            }
        }
    }
    
    public void remove(int amount){
        if(amount>0){
            if(this.c-amount>=0){
                this.c-=amount;                
            }else{
                this.c=0;                
            }
        }
    }
    
    public String toString(){
        return this.c+"/100";
    }    
    
    
}
