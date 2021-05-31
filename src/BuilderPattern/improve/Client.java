package BuilderPattern.improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();

        HouseBuilder houseBuilder = new BigHouseBuilder();
        houseDirector.setBuilder(houseBuilder);

        House house = houseDirector.buildAHouse();

        System.out.println(house);

    }
}
