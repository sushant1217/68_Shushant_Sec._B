
public class Person {
	String name;
	int age; 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Person Sushant = new Person("Sushant",20);
		Person Sachin = new Person("Sachin",21);
		System.out.println("First Object Name = "+Sushant.name+" Age = "+Sushant.age);
		System.out.println("Second Object Name = "+Sachin.name+" Age = "+Sachin.age);
	}

}
