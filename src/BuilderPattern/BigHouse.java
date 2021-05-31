package BuilderPattern;

public class BigHouse extends House{
    @Override
    public void buildBase() {
        System.out.println("大房子造基层");
    }

    @Override
    public void buildWall() {
        System.out.println("大房子造墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("大房子造房顶");
    }
}
