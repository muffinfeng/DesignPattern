package AdapterPattern.objectAdapter;

//ÊÊÅäÆ÷
public class Adapter  implements Charge5V {

    private Charge220V charge220V;

    public Adapter(Charge220V charge220V){
        this.charge220V = charge220V;
    }


    @Override
    public int charge5v() {
        int v = charge220V.charge220V();
        int adapterV = v / 44;
        return adapterV;
    }
}
