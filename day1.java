abstract class Person{
	protected String name;
	protected int age;

	// constructor
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	abstract void displayInfo();
}