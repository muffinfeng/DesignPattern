package visitorPattern;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("���˵�������ʧ��");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Ů�˵�������ʧ��");

    }
}
