package desafios;

import static java.util.Arrays.asList;

import java.util.ArrayList;
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
		
		List<String> result = new ArrayList<>();
		for (int i = 0; i < stringList.size(); i++) {
			if(validateIsNumber( stringList.get(i) )){
				result.add(stringList.get(i));
			}
		}
		return result;
	}
}




