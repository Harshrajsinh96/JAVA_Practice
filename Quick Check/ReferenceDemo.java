public class ReferenceDemo {

	public static void main(String[] args) {
        Reference ref1, ref2;
        final Reference ref3;

        ref1 = new Reference("This is the first reference variable", 1);
        int number = ref1.getNumber();
        System.out.println("number= " + number);
        
        ref2 = new Reference("This is the second reference variable", 2);
        ReferenceDemo.printText(ref2);
        
        ref2 = new Reference("This is the 636` reference variable", 8);
        ReferenceDemo.printText(ref2);
        
        ref3 = new Reference("This is the third reference variable", 3);
        int number2 = ref3.getNumber();
        System.out.println("number= " + number2);
        ref3.setNumber(10);
        number2 = ref3.getNumber();
        System.out.println("number= " + number2);
       // ref3= new Reference("Chnging value",5);
		}

    public static void printText(Reference reference) {
        String text = reference.getText();
        System.out.println(text);
    }
}
