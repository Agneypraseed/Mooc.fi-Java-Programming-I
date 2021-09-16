import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items=new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id=scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            String name=scanner.nextLine();
            System.out.println("Name? (empty will stop)");
            if(name.isEmpty()){
                break;
            }
            Archive item=new Archive(id,name);
            if(!(items.contains(item))){
                items.add(item);
            }
        }
            System.out.println("==Items==");
            for(Archive item:items){
                System.out.println(item.getId()+": "+item.getName());
            }
        

    }
}

class Archive {
    private String id;
    private String name;
    
    public Archive(String id,String name){
        this.id=id;
        this.name=name;
    }
  
    public boolean equals(Object item){
        Archive a=(Archive) item;
        if(this.id.equals(a.id)){
            return true;
        }else{
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}