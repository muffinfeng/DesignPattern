package AdapterPattern.springmvc;

public interface Controller {


    public void doRealHandle();
}

class SimpleController implements Controller{

    @Override
    public void doRealHandle() {
        System.out.println("Œ“ «SimpleController");
    }
}

class HttpController implements Controller{

    @Override
    public void doRealHandle() {
        System.out.println("HttpController");
    }
}

class AnnotationController implements Controller{

    @Override
    public void doRealHandle() {
        System.out.println("AnnotationController");
    }
}
