package no.dat102.sirkulaer;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.adt.KoeADTTest;
import no.hvl.dat102.sirkulaer.SirkulaerKoe;

public class sirkulerKoeTest<T> extends KoeADTTest {

	@Override
	protected KoeADT<Integer> reset() {
		
		return new SirkulaerKoe<Integer>();
	}


	
}

	


