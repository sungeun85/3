package sec13.exam02_constructor_access.package1;

public class A {
	//�ʵ�
	A a1 = new A(true);   //(0)
	A a2 = new A(1);      //(0)
	A a3 = new A("���ڿ�"); //(0)
	
	//������
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
}