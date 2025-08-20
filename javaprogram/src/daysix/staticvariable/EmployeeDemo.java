package daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {

		System.out.println(Employee.companyName);
		Employee e = new Employee("Dinesh", 420);
		System.out.println(e);
		e = new Employee("Tilak", 143);
		System.out.println(e);
	}

}
