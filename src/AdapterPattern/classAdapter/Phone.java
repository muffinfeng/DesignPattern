package AdapterPattern.classAdapter;

public class Phone {

    public void  charge(Charge5V charge5V){
        if(charge5V.charge5v() == 5){
            System.out.println("���ڳ�磬5V~~");
        }else{
            System.out.println("����5V����ը");
        }
    }
}
