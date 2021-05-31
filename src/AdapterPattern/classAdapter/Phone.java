package AdapterPattern.classAdapter;

public class Phone {

    public void  charge(Charge5V charge5V){
        if(charge5V.charge5v() == 5){
            System.out.println("正在充电，5V~~");
        }else{
            System.out.println("不是5V，爆炸");
        }
    }
}
