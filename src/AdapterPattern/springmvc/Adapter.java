package AdapterPattern.springmvc;

public interface  Adapter {

    public boolean isSupport(Object controller);

    public void doHandle(Object controller);

}

class SimpleAdapter implements Adapter{

    @Override
    public boolean isSupport(Object controller) {
        return (controller instanceof SimpleController);
    }

    @Override
    public void doHandle(Object controller) {
        ((SimpleController)controller).doRealHandle();
    }
}

class HttpAdapter implements Adapter{

    @Override
    public boolean isSupport(Object controller) {
        return (controller instanceof HttpController);
    }

    @Override
    public void doHandle(Object controller) {
        ((HttpController)controller).doRealHandle();
    }
}

class AnnotationAdapter implements Adapter{

    @Override
    public boolean isSupport(Object controller) {
        return (controller instanceof AnnotationController);
    }

    @Override
    public void doHandle(Object controller) {
        ((AnnotationController)controller).doRealHandle();
    }
}