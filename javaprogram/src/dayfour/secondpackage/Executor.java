package dayfour.secondpackage;

import dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {

		Base b1=new Base();
		
		b1.methodPublic();
		b1.varPublic = 45;
		b1.methodPublic();
	}

}
