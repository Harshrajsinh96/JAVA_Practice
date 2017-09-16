class Animals {
	
public static void main(String [] args) {
		
		Animals h = new Horse();
		h.eat();
		
	}

	private void eat() {
		System.out.println("Private eat of animals");
	}
	
}

class Horse extends Animals {}