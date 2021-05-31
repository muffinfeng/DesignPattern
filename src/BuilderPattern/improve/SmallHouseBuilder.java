package BuilderPattern.improve;

public class SmallHouseBuilder extends HouseBuilder{

    @Override
    public void buildBase() {
        System.out.println("小房子造地基");
        super.house.setBase("小房子地基");
    }

    @Override
    public void buildWall() {
        System.out.println("小房子造墙");
        super.house.setWall("小房子墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("小房子造天花");
        super.house.setRoof("小房子天花");
    }
}
