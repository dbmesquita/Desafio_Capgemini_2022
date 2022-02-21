package br.com.dbmesquita.capgemini.questions.IdentifySubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IdentifySubstring {

	
	@Test
	void shouldidentifySubstringMethodReturnZero() {
		identifySubstringMethod pair = new identifySubstringMethod();
		Assertions.assertEquals(0, pair.countSubsrtring("nos"));
	}

	
	@Test
	void shouldidentifySubstringMethodReturnOne() {
		identifySubstringMethod pair = new identifySubstringMethod();
		Assertions.assertEquals(1, pair.countSubsrtring("ff"));
	}
	
	@Test
	void shouldidentifySubstringMethodReturnTwo() {
		identifySubstringMethod pair = new identifySubstringMethod();
		Assertions.assertEquals(2, pair.countSubsrtring("ovo"));
	}

	
	@Test
	void shouldidentifySubstringMethodReturnThree() {
		identifySubstringMethod pair = new identifySubstringMethod();
		Assertions.assertEquals(3, pair.countSubsrtring("ifailuhkqq"));
	}
	
	@Test
	void shouldidentifySubstringMethodReturnFour() {
		identifySubstringMethod pair = new identifySubstringMethod();
		Assertions.assertEquals(4, pair.countSubsrtring("xyyx"));
	}

}
