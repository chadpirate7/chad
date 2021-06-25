package test20210618_4;

public class animal {
	public void sound()
}

class Dog extends Animal {
	public void sound()
	{
		System.out.println("¸Û¸Û!");
	}
}
public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
	}
}