package ProxyPattern.dynamic;

public class Client {

    public static void main(String[] args) {
        ITeacher iTeacher = new Teacher();

        ProxyFactory proxyFactory = new ProxyFactory(iTeacher);

        ITeacher teacher = (ITeacher) proxyFactory.getProxyInstance();

        teacher.teach();
    }
}
