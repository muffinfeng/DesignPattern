package AdapterPattern.classAdapter;

//被适配者，src
public class Charge220V {

    public int charge220V(){
        System.out.println("我输出220v的电");
        return 220;
    }
}
