package Inheritance;

class One{
	public void print_hello()
	{
		System.out.println("Hello");
	}
	public void print_hello_world() {
		System.out.println("Hello world");
	}
}
class Two extends One{
	public void print_world()
	{
		System.out.println("world");
	}
}


