package BridgePattern;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("ֱ���ֻ�����");
    }

    public void close(){
        super.open();
        System.out.println("ֱ���ֻ��ػ�");
    }

    public void call(){
        super.open();
        System.out.println("ֱ���ֻ���绰");
    }
}
