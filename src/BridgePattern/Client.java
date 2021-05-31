package BridgePattern;

public class Client {

    public static void main(String[] args) {
        Brand brand = new Huawei();
        Phone phone = new UpRightPhone(brand);

        phone.open();
        phone.call();
    }
}
