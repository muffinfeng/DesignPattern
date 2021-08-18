package visitorPattern;

public class Fail extends Action{
    @Override
    public void getResult(Man man) {
        System.out.println("男人的评价是失败");
    }

    @Override
    public void getResult(Woman woman) {
        System.out.println("女人的评价是失败");

    }
}
