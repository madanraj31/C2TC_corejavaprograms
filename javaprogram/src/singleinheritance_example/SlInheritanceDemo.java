package singleinheritance_example;

public class SlInheritanceDemo {

	public static void main(String[] args) {
		
		Trainer t=new Trainer(111,"Madanraj","Puducherry",52,"lead","Chennai");
		System.out.println(t);
		
		Person p=new Person(112,"Tilakkumar","Puducherry");
		System.out.println(p);
	}

}