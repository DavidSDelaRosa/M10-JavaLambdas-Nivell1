package fase1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//1. Devuelve cadenas que empiecen por 'A' y que tengan 3 letras
		
		//variables String pasadas a List con Collectins.addAll:
		System.out.println("Ejercicio 1: ");
		String n1="David", n2="Alberto", n3="Ana", n4="Jesús", n5="Aba", n6="Victor";
		List<String> nombres = new ArrayList<>();
		Collections.addAll(nombres, n1, n2, n3, n4, n5, n6);
		
		//Filtro sin método:
		nombres.stream().filter(n->n.startsWith("A"))
			.filter(n->n.length()==3)
			.collect(Collectors.toList()).forEach(s->System.out.println(s));;
	
		//Filtro con método static (permite otra letra y otra longitud): 
		System.out.println(filterByFirtLetterAndLength(nombres, 'A', 3));
		
		//2. Devolver String con letra en función de si los números son pares o impares, separados por comas:
		System.out.println("\nEjercicio 2");
		List<Integer> listaDeNumeros = new ArrayList<>(Arrays.asList(5,12,6,2,9,14, 44, 23, 77));
		
		//Con función:
		System.out.println(numbersByEvenOrOddPlusAddingALetter(listaDeNumeros, 'e', 'o'));
		//Directo:
		String stringResultado = listaDeNumeros.stream().map(numero->numero%2 ==0? "e" + numero : "o" + numero).collect(Collectors.joining(", "));

		System.out.println(stringResultado);
		//3. De una lista de Strings, Strings que contengan la letra ‘o’:
		
		System.out.println("\nEjercicio 3: ");
		List<String> listaDeStrings = new ArrayList<>(Arrays.asList("hola", "adios", "mesa", "silla", "ajedrez", "lampara", "cubierto"));
		
		List<String> resultado = filterListByLetter(listaDeStrings, 'o');
		resultado.forEach(s->System.out.println(s));
		
		//4. Devolver de una lista de Strings aquellas que tengan más de 5 carácteres:
		System.out.println("\nEjercicio 4: ");
		filterByLength(listaDeStrings,5).forEach(s->System.out.println(s));
		
		//5. Imprimir con lamdas los nombres de los meses del año, 
		System.out.println("\nEjercicio 5: ");
		List<String> mesesDelAnyo = new ArrayList<>(
				Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre","Noviembre", "Diciembre"));
		
		mesesDelAnyo.forEach(mes->System.out.println(mes));
		
		//6. Imprimir con función:
		System.out.println("\nEjercicio 6: ");
		printListWithLambda(mesesDelAnyo);
	}
	
	public static List<String> filterByFirtLetterAndLength(List<String> listaNombres, char firstLetter, int length){
		
		return listaNombres.stream().filter(nombre->nombre.startsWith(String.valueOf(firstLetter)))
				.filter(nombre->nombre.length()==length)
				.collect(Collectors.toList());
	}

	public static String numbersByEvenOrOddPlusAddingALetter(List<Integer> listaNumeros, char letterForEvens, char letterForOdds) {
		
		StringBuilder sb = new StringBuilder();
		
		listaNumeros.stream().forEach((Integer s)->{
			if(s%2==0) {
				sb.append(letterForEvens);
				sb.append(s);
				sb.append(", ");
			}else {
				sb.append(letterForOdds);
				sb.append(s);
				sb.append(", ");
			}
		});;
		
		return sb.toString();
	}
	
	public static List<String> filterListByLetter(List<String> listaDeStrings, char letter){
		
		return listaDeStrings.stream().filter(s->s.contains(String.valueOf(letter))).collect(Collectors.toList());
	}
	
	public static List<String> filterByLength(List<String> listaDeStrings, int length){
		
		return listaDeStrings.stream().filter(s->s.length()>=5).collect(Collectors.toList());
		
	}
	
	public static void printListWithLambda(List<String> listToPrint) {
		listToPrint.forEach(string->System.out.println(string));
	}
}
