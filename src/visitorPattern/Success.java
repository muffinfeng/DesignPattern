package visitorPattern;

public class Success extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("���˵������ǳɹ�");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Ů�˵������ǳɹ�");

    }
}
