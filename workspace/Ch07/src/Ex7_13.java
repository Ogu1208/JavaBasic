
public class Ex7_13 {

	class InstanceInner {}
	static class StaticInner{}
	
	//�ν��Ͻ���� ������ ���� ���� ������ ����
	InstanceInner iv = new InstanceInner();
	// static��� ������ ���� ���� ������ ����
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static ����� �ν��Ͻ������ ���� ������ �� ����.
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
