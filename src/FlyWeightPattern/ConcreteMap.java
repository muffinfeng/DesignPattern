package FlyWeightPattern;

public class ConcreteMap extends Map{

    //这是内部状态
    public String type;

    public ConcreteMap(String type) {
        this.type = type;
    }

    @Override
    public void play(Player player) {
        System.out.println(player.getName() + "正在玩 " + type + "地图");
    }
}
