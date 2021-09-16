
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String s="";
        if(this.getElements().isEmpty()){
        s="The collection "+this.name+" is empty.";
        return s;
        }else{
            int n=this.getElements().size();
            if(n>1){
            s+="The collection "+this.name+" has "+n+" elements:"+"\n";
            for(int i=0;i<this.elements.size()-1;i++){
                s+=this.elements.get(i)+"\n";
            }
            s+=this.elements.get(this.elements.size()-1);
            return s;
            }else{
                s+="The collection "+this.name+" has "+n+" element:"+"\n";
            for(int i=0;i<this.elements.size();i++){
                s+=this.elements.get(i);
            }
            return s;
            }
        }
        
        
    }
    
    
}
