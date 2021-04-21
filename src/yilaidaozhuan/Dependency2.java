package yilaidaozhuan;

public class Dependency2 {
	public static void main(String[] args) {
		Sky sky = new Sky();
		Line line = new Line();
		openAndClose2Impl openAndClose2Impl = new openAndClose2Impl();
		openAndClose2Impl.open(sky);
		openAndClose2Impl.open(line);
	}

}



interface ITv{
	public void play();
}

class Sky implements ITv{
	public void play() {
		System.out.println("Sky play ");
	}
}

class Line implements ITv{
	public void play() {
		System.out.println("Line play ");
	}
}

class openAndClose2Impl{
	public void open(ITv tv) {//这种是通过接口传递实现依赖，更灵活
		tv.play();
	}
}