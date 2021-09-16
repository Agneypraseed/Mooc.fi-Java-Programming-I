
import java.util.ArrayList;

public class MainProgram {
    // update here your exercise progress
    public static void main(String[] args) {
        
        int n=partsCompleted();
        System.out.println(n);
    }
    
    public static int partsCompleted() {
        int i=0;
        ExerciseManagement m = new ExerciseManagement();
        m.add("exc 1");
        m.add("exc 2");
        m.add("exc 3");
        m.markAsCompleted("exc 1");
        m.markAsCompleted("exc 3");
        ArrayList<Exercise> list = m.exerciseList();
        for (Exercise l : list) {
            if(m.isCompleted(l.getName())){
               i++;
            }
        }
        return i;
    }
}