package BridgePattern;

//�䵱һ���ţ�����Ʒ�ƺ���ʽ�Ĺ�ϵ
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    public void open(){
        this.brand.open();
    }

    public void close(){
        this.brand.close();
    }

    public void call(){
        this.brand.call();
    }


}
