package yilaidaozhuan;

public class Dependency4 {
	public static void main(String[] args) {
		Kangjia k = new Kangjia();
		OpenAndClose4Impl openAndClose4Impl = new OpenAndClose4Impl();
		openAndClose4Impl.setItv(k);
		openAndClose4Impl.open();
	}
}

//通过setter方法传递依赖

interface ITv4{
	public void play();
}

class Kangjia implements ITv4{
	public void play() {
		System.out.println("Kangjia is play");
	}
}

class OpenAndClose4Impl{
	ITv4 itv;
	public void open() {
		itv.play();
	}
	
	public void setItv(ITv4 itv) {
		this.itv = itv;
	}
	
}