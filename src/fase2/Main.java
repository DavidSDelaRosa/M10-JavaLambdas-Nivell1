package fase2;

interface PiValue{
	abstract double getPiValue();
}

public class Main {

	public static void main(String[] args) {
		
		PiValue pv = () -> 3.1416;
		System.out.println(pv.getPiValue());
		
	}

}
