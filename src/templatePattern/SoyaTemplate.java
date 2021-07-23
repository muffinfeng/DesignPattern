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
        System.out.println("º”»Îª∆∂π");
    }

    public abstract void addAdition();

    public void boil(){
        System.out.println("÷Û∂πΩ¨");
    }

    public boolean mounted(){
        return true;
    }
}
