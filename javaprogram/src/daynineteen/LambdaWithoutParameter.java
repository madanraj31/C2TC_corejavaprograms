package daynineteen;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		IsStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());
	}

}
