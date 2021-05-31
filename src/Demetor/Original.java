package Demetor;

import java.util.ArrayList;
import java.util.List;

public class Original {
}

class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for(int i = 0;i< 10;i++){
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id = " + i);
            list.add(emp);
        }
        return list;
    }
}

//CollegeEmployee 不是直接朋友关系
//Employee，CollegeManager是直接朋友关系
class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();

        for(int i = 0;i< 5;i++){
            Employee emp = new Employee();
            emp.setId("学院总部员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(CollegeManager sub){
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------分公司员工-----");
        for(CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------学校总部员工-----");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}