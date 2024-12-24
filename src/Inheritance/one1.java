package Inheritance;

class One1{
	public void eat() {
	System.out.println("One eats");
}
}
class Two2 extends One1{
	public void sleep() {
		System.out.println("Two sleeps");
	}
}
class Three3 extends Two2{
	public void run() {
		System.out.println("Three runs");
	}
}


