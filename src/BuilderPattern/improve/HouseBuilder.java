package BuilderPattern.improve;

public abstract class HouseBuilder {

    House house = new House();

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void buildRoof();

     public House getHouse(){
         return house;
     }
}
