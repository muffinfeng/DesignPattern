package visitorPattern;


//˵��
//1.��������ʹ�õ���˫���ɣ��������ڿͻ��˳����У�������״̬��Ϊ��������Man�У���һ�Σ�
//2.Ȼ��Man�������Ϊ�����ġ�����������еķ���getManResult��ͬʱ���Լ���this����Ϊ�������룬��ɵڶ��εķ��ɡ�
public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
