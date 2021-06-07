package fase3;

public class Main {

	public static void main(String[] args) {
		
		Reversing ref2 = (str) -> {
			
			return new StringBuilder(str).reverse().toString();
		};
		
		System.out.println("The string reversed = " + ref2.reverse("Zaragoza"));

	}

}
interface Reversing{
	
	abstract String reverse(String s);
}