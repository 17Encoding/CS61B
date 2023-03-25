public class DogLauncher {
	public static void main(String[] args) {
		Dog d1 = new Dog(51);
		Dog d2 = new Dog(100);

		Dog bigger = Dog.maxDog(d1, d2);
		bigger.makeNoise();
		
		//System.out.println(d1.binomen);
		//System.out.println(d2.binomen);
		System.out.println(Dog.binomen);
	}
}

