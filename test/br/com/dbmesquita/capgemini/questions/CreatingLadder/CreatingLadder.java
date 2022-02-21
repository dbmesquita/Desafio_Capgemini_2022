package br.com.dbmesquita.capgemini.questions.CreatingLadder;


import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.dbmesquita.capgemini.questions.CreatingLadder.creatingLadderMethod.*;

class CreatingLadder {

	@Test
	void shouldLadderBuildingReturnOne() throws Exception {
		creatingLadderMethod creatingLadder = new creatingLadderMethod();
		Assertions.assertEquals("  *\n **\n***", creatingLadder);
		
	}


	/*@Test
	void shouldLadderBuildingReturnNothing() throws Exception {
		creatingLadderMethod creatingLadder = new creatingLadderMethod();
		String text = tapSystemOut(()->{
			creatingLadder.ladderBuilding(0);
		});
		Assertions.assertEquals("", text.trim());
	}*/
}