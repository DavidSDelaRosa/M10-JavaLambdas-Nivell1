package fase3;

public class Main {

	public static void main(String[] args) {
		
		Reversing exampleString = (str) -> {
			
			return new StringBuilder(str).reverse().toString();
		};
		
		System.out.println("The string reversed = " + exampleString.reverse("Zaragoza"));

	}

}
interface Reversing{
	
	abstract String reverse(String s);
}