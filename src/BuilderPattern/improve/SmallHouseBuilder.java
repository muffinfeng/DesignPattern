package BuilderPattern.improve;

public class SmallHouseBuilder extends HouseBuilder{

    @Override
    public void buildBase() {
        System.out.println("С������ػ�");
        super.house.setBase("С���ӵػ�");
    }

    @Override
    public void buildWall() {
        System.out.println("С������ǽ");
        super.house.setWall("С����ǽ");
    }

    @Override
    public void buildRoof() {
        System.out.println("С�������컨");
        super.house.setRoof("С�����컨");
    }
}
