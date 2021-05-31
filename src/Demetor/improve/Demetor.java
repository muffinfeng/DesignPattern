package Demetor.improve;

import java.util.ArrayList;
import java.util.List;

public class Demetor {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(collegeManager);
    }

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
    public void printAllEmployee(){
        System.out.println("------分公司员工-----");
        List<CollegeEmployee> list1 = this.getAllEmployee();
        for(CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
    }
}

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
        sub.printAllEmployee();


        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------学校总部员工-----");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}
