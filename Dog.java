package testiluokka;

public class Dog {
	
		String name;

		public Dog(String name) {
			this.name = name;
		}

		public String toString() {
			return "Dog: " + name;
		}
		
		
		public void hunting(Cat cat) {
			System.out.println(this.name + " chasing an object " + cat);
		}
	}

