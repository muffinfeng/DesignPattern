package BuilderPattern.improve;

public class BigHouseBuilder extends HouseBuilder{

    @Override
    public void buildBase() {
        System.out.println("������ػ�");
        super.house.setBase("���ӵػ�");
    }

    @Override
    public void buildWall() {
        System.out.println("������ǽ");
        super.house.setWall("����ǽ");
    }

    @Override
    public void buildRoof() {
        System.out.println("�������컨");
        super.house.setRoof("�����컨");
    }
}
