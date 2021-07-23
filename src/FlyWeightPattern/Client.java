package FlyWeightPattern;

public class Client {

    public static void main(String[] args) {
        MapFactory mapFactory = new MapFactory();

        Map map1 = mapFactory.getMap("¼«µØÂÒ¶·");
        map1.play(new Player("ÑÇË÷"));
        map1.play(new Player("½Ù"));

        Map map2 = mapFactory.getMap("Æ¥Åä");
        map2.play(new Player("¹â»Ô"));
        map2.play(new Player("ÅµÊÖ"));

        Map map3 = mapFactory.getMap("Æ¥Åä");
        map3.play(new Player("¹·¹·"));
        map3.play(new Player("±â±â"));

        System.out.println(mapFactory.getMapsLength());
    }
}
