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
            emp.setId("ѧԺԱ��id = " + i);
            list.add(emp);
        }
        return list;
    }
}

//CollegeEmployee ����ֱ�����ѹ�ϵ
//Employee��CollegeManager��ֱ�����ѹ�ϵ
class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();

        for(int i = 0;i< 5;i++){
            Employee emp = new Employee();
            emp.setId("ѧԺ�ܲ�Ա��id = " + i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(CollegeManager sub){
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("------�ֹ�˾Ա��-----");
        for(CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------ѧУ�ܲ�Ա��-----");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}