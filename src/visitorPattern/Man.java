package visitorPattern;


//˵��
//��������ʹ�õ���˫����
public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getResult(this);//�ڶ��η��ɣ�����this��������Man����Women��ѡ��ִ���ĸ�������
    }
}
