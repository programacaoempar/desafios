package desafios;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumber {

	public static void main(String[] args) {
		String[] newList = new String[] { "123", "Diego", "Karina", "34", "Leon", "154", "25/12", "PairProgramming", "17.01" };

		System.out.println( "O tamanho do array é: " + newList.length );

		List<String> stringList = asList( newList );
		List<String> result = stringList.stream()
				.filter( value -> validateIsNumber( value ) )
				.collect( Collectors.toList() );

		System.out.println( "O tamanho do array é: " + result.toArray().length );

		System.out.println( "O tamanho do array é: " + result );
	}

	private static boolean validateIsNumber(String value) {
		try {
			Integer.parseInt( value );

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}




