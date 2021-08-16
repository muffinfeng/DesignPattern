package visitorPattern;

import java.util.ArrayList;
import java.util.List;

public class ActionStructure {

    private List<Person> list = new ArrayList<>();

    public void attach(Person person){
        list.add(person);
    }

    public void detach(Person person){
        list.remove(person);
    }

    public void display(Action action){
        for(Person person : list){
            person.accept(action);
        }
    }
}
