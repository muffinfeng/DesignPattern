package yilaidaozhuan;

public class Dependency1 {

	
	
	
}

class openAndClose {
	public void open(Changhong c) {//������ͨ������ϸ���� ����ʵ������
		c.play();
	}
	public void open(Sony c) {
		c.play();
	}
}

class Changhong {
	public void play() {
		
	}
}

class Sony {

	public void play() {
		
	}
}


