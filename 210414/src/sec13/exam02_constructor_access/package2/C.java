package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class C {
	//필드
	A a1 = new A(true);   //(0)
	A a2 = new A(1);      //(x)
	A a3 = new A("문자열"); //(x)
}