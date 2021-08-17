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
            person.accept(action);//第一次动态分派，根据person的子类是Man还是Woman，来执行响应的accept方法。
        }
    }
}
