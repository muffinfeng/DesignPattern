package AdapterPattern.interfaceAdapter;

public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter() {
            @Override
            public void m1() {
                System.out.println("ʹ����m1");
            }
        };

        adapter.m1();
    }
}
