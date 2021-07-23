package templatePattern;

public abstract class SoyaTemplate {

    public final void template(){
        addBean();
        if(mounted()){
            addAdition();
        }
        boil();
    }

    public void addBean(){
        System.out.println("����ƶ�");
    }

    public abstract void addAdition();

    public void boil(){
        System.out.println("�󶹽�");
    }

    public boolean mounted(){
        return true;
    }
}
