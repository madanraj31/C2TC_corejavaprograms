package daysix.usingfinal;

class FinalMethodClass {
	FinalMethodClass(){
		System.out.println("This is default constructor");
	}
	final int a = 50;

	final void show() {
		System.out.println("Value of a: " + a);
	}
}
