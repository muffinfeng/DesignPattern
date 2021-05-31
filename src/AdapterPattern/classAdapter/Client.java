package AdapterPattern.classAdapter;

public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Phone phone = new Phone();
        phone.charge(adapter);
    }
}
