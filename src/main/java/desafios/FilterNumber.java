package desafios;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
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
		ArrayList<String> matches = new ArrayList<String>();

		Pattern p = Pattern.compile("\\d+");

		for (String s:newList) {
			if (p.matcher(s).matches()) {
				matches.add(s);
			}
		}

		return matches;
	}
}




