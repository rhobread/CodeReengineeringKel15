package leaky_Encapsulation_After;

import java.util.Vector;

public class ToDoList {
    //....
    private Vector<ToDo> list;

    public ToDoList() {
        list = new Vector<>();
    }

    public Vector<ToDo> getlist() {
        // Deep Copy 
        Vector<ToDo> result = new Vector<>();

        
        

         for (ToDo todo : list) {
             try {
                 result.add((ToDo) todo.clone());
             } catch (CloneNotSupportedException e) {
                 e.printStackTrace();
             }
         }

        return result;
    }

    public ToDo getByName(String name) {
        for (ToDo toDo : list) {
            if(toDo.getName().equals(name)) return toDo;
        }

        return null;
    }

    public void add(ToDo t) {
        list.add(t);
    }
    
    //....
}
