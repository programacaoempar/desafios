package desafios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FilterNumberTest {

	@Test
	void testaFilterNumber() {
		String[] newList = new String[] { "123", "Diego", "Karina", "34", "Leon", "154", "25/12", "PairProgramming",
				"17.01" };

		FilterNumber filterNumber = new FilterNumber();

		assertEquals( 3, filterNumber.filtra( newList ).size() );
	}

}