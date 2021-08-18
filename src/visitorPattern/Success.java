package visitorPattern;

//这是访问者
public class Success extends Action{

    @Override
    public void getResult(Man man) {
        System.out.println("男人的评价是成功");
    }

    @Override
    public void getResult(Woman woman) {
        System.out.println("女人的评价是成功");

    }
}
