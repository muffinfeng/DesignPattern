package yilaidaozhuan;

public class Dependency1 {

	
	
	
}

class openAndClose {
	public void open(Changhong c) {//这种是通过具体细节类 传递实现依赖
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


