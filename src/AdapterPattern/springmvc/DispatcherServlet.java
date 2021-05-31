package AdapterPattern.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet {

    private List<Adapter> list = new ArrayList<Adapter>(3);

    public DispatcherServlet(){
        list.add(new SimpleAdapter());
        list.add(new AnnotationAdapter());
        list.add(new HttpAdapter());
    }

    public void doDispatch(){
        HttpController controller = new HttpController();

        Adapter adapter = getAdapter(controller);

        adapter.doHandle(controller);
    }

    public Adapter getAdapter(HttpController controller) {
        for(Adapter adapter : list){
            if(adapter.isSupport(controller)){
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatcherServlet().doDispatch();
    }
}
