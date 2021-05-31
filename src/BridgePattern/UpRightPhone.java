package BridgePattern;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立手机开机");
    }

    public void close(){
        super.open();
        System.out.println("直立手机关机");
    }

    public void call(){
        super.open();
        System.out.println("直立手机打电话");
    }
}
