package BuilderPattern.improve;

public class HouseDirector {

    private HouseBuilder builder;

    public void setBuilder(HouseBuilder houseBuilder){
        this.builder = houseBuilder;
    }

    public House buildAHouse(){
        builder.buildBase();
        builder.buildWall();
        builder.buildRoof();

        return builder.house;
    }
}
