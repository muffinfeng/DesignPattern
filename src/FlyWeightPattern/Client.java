package FlyWeightPattern;

public class Client {

    public static void main(String[] args) {
        MapFactory mapFactory = new MapFactory();

        Map map1 = mapFactory.getMap("�����Ҷ�");
        map1.play(new Player("����"));
        map1.play(new Player("��"));

        Map map2 = mapFactory.getMap("ƥ��");
        map2.play(new Player("���"));
        map2.play(new Player("ŵ��"));

        Map map3 = mapFactory.getMap("ƥ��");
        map3.play(new Player("����"));
        map3.play(new Player("���"));

        System.out.println(mapFactory.getMapsLength());
    }
}
