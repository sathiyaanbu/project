package testiluokka;

public class Cat {
	
		private String name;

		public Cat(String name) {
			this.name =name;
		}

		public void escape(Dog dog) {
			System.out.println(this.name + " runaway object is " + dog);
		}

		public String toString() {
			return "Cat: " + name;
		}
	}

