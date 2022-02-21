package br.com.dbmesquita.capgemini.questions.CreatingLadder;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class CreatingLadder {

	@Test
	void shouldLadderBuildingReturnOne() throws Exception {
		creatingLadderMethod creatingLadder = new creatingLadderMethod();
		String text = tapSystemOut(()->{
			creatingLadder.ladderBuilding(1);
		});
		Assertions.assertEquals("*", text.trim());
	}


	@Test
	void shouldLadderBuildingReturnNothing() throws Exception {
		creatingLadderMethod creatingLadder = new creatingLadderMethod();
		String text = tapSystemOut(()->{
			creatingLadder.ladderBuilding(0);
		});
		Assertions.assertEquals("", text.trim());


	}
