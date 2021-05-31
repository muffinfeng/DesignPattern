package BuilderPattern;

public abstract class House {

    public abstract void buildBase();

    public abstract void buildWall();

    public abstract void buildRoof();

    public void build(){
        buildBase();
        buildWall();
        buildRoof();
    }

}
