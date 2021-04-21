package yilaidaozhuan;

public class Dependency3 {
	public static void main(String[] args) {
		World world = new World();
		OpenAndClose3Impl openAndClose3Impl = new OpenAndClose3Impl(world);
		openAndClose3Impl.open();
	}
}

//ͨ�����췽����������

interface ITv3{
	public void play();
}

class World implements ITv3{
	public void play() {
		System.out.println("world is play");
	}
}

class OpenAndClose3Impl{
	ITv3 itv;
	public void open() {
		itv.play();
	}
	
	OpenAndClose3Impl( ITv3 itv){
		this.itv = itv;
	}
}