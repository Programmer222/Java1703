package day08;

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal() {
		super();
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Abstract methods do not specify a body
	/*public abstract void showInfo() {
		System.out.println("Animal [name=" + name + ", age=" + age + "]");
	}*/
	
	public abstract void showInfo(); 
	
}
