package BuilderPattern;

public class BigHouse extends House{
    @Override
    public void buildBase() {
        System.out.println("���������");
    }

    @Override
    public void buildWall() {
        System.out.println("������ǽ");
    }

    @Override
    public void buildRoof() {
        System.out.println("�����췿��");
    }
}
