package BridgePattern;

public class Huawei implements Brand{
    @Override
    public void open() {
        System.out.println("��Ϊ�ֻ�����");
    }

    @Override
    public void close() {
        System.out.println("��Ϊ�ֻ��ػ�");
    }

    @Override
    public void call() {
        System.out.println("��Ϊ�ֻ���绰");
    }
}
