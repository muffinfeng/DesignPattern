package visitorPattern;

public class Fail extends Action{
    @Override
    public void getResult(Man man) {
        System.out.println("���˵�������ʧ��");
    }

    @Override
    public void getResult(Woman woman) {
        System.out.println("Ů�˵�������ʧ��");

    }
}
