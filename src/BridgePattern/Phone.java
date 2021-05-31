package BridgePattern;

//充当一个桥，连接品牌和样式的关系
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
