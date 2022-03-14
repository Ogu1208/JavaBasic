
public class Ex7_13 {

	class InstanceInner {}
	static class StaticInner{}
	
	//인스턴스멤버 간에는 서로 직접 접근이 가능
	InstanceInner iv = new InstanceInner();
	// static멤버 간에는 서로 직접 접근이 가능
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}

}
