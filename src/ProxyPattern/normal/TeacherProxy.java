package ProxyPattern.normal;

public class TeacherProxy implements ITeacher{

    ITeacher iTeacher;

    public TeacherProxy(ITeacher iTeacher){
        this.iTeacher = iTeacher;
    }

    @Override
    public void teach() {
        System.out.println("hi  ...");
        iTeacher.teach();
        System.out.println("bye ...");
    }
}
