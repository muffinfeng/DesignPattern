package AdapterPattern.objectAdapter;

public class Client {

    public static void main(String[] args) {
        Charge220V charge220V = new Charge220V();

        Adapter adapter = new Adapter(charge220V);

        Phone phone = new Phone();

        phone.charge(adapter);
    }
}
