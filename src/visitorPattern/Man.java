package visitorPattern;


//说明
//这里我们使用到了双分派
public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getResult(this);//第二次分派，根据this的类型是Man还是Women来选择执行哪个方法。
    }
}
