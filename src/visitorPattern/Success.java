package visitorPattern;

//���Ƿ�����
public class Success extends Action{

    @Override
    public void getResult(Man man) {
        System.out.println("���˵������ǳɹ�");
    }

    @Override
    public void getResult(Woman woman) {
        System.out.println("Ů�˵������ǳɹ�");

    }
}
