package desafios;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumber {

	private boolean validateIsNumber(String value) {
		try {
			Integer.parseInt( value );

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public List<String> filtra(String[] newList) {
		List<String> stringList = asList( newList );
		List<String> result = stringList.stream()
				.filter( value -> validateIsNumber( value ) )
				.collect( Collectors.toList() );
		return result;
	}
}




