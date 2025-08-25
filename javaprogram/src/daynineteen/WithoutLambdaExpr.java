package daynineteen;

public class WithoutLambdaExpr {

	public static void main(String[] args) {

		IsStatement s=new IsStatement() {
        	public String show()
        	{
        		return "Welcome to Lambda Expression";
        	}};
        	
        	System.out.println(s.show());
	}

}
