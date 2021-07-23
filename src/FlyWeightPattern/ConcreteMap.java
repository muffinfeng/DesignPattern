package FlyWeightPattern;

public class ConcreteMap extends Map{

    //�����ڲ�״̬
    public String type;

    public ConcreteMap(String type) {
        this.type = type;
    }

    @Override
    public void play(Player player) {
        System.out.println(player.getName() + "������ " + type + "��ͼ");
    }
}
