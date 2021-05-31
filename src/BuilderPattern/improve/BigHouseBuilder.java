package BuilderPattern.improve;

public class BigHouseBuilder extends HouseBuilder{

    @Override
    public void buildBase() {
        System.out.println("大房子造地基");
        super.house.setBase("大房子地基");
    }

    @Override
    public void buildWall() {
        System.out.println("大房子造墙");
        super.house.setWall("大房子墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("大房子造天花");
        super.house.setRoof("大房子天花");
    }
}
