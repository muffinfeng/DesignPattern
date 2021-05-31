package AdapterPattern.classAdapter;

//ÊÊÅäÆ÷
public class Adapter extends Charge220V implements Charge5V{

    @Override
    public int charge5v() {
        int v = charge220V();
        int adapterV = v / 44;
        return adapterV;
    }
}
