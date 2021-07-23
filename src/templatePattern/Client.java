package templatePattern;

public class Client {
    public static void main(String[] args) {
        SoyaTemplate redBean = new RedBeanSoya();
        redBean.template();

        SoyaTemplate pureBean = new PureSoya();
        pureBean.template();
    }
}
