package BridgePattern;

public class SlidePhone extends Phone{

    public SlidePhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("滑盖手机开机");
    }

    public void close(){
        super.open();
        System.out.println("滑盖手机关机");
    }

    public void call(){
        super.open();
        System.out.println("滑盖手机打电话");
    }

}
