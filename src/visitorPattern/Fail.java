package visitorPattern;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价是失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价是失败");

    }
}
