package maven.demo.test.helloworld;

public class HelloWorld {
	private String name;

	public void setName(String n) {
		this.name = n;
	}

	public void printHello() {
		System.out.println("The first Spring 3: Hello " + name);
	}
}
