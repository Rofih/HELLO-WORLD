import java.time.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MensturationAppTest{

	@Test
	public void testThatItCalculatesMenstralCycle(){
	MensturationApp menstralCycle = new MensturationApp();
	String lastFlowDate = "2007-04-02";
	int cycleDuration = 28;
	LocalDate newCycleDate = menstralCycle.calculateFlow(lastFlowDate,cycleDuration);
	String expected = "2007-04-30";
	LocalDate date = LocalDate.parse(expected);
	assertEquals(date, newCycleDate);

	}

	@Test
	public void testThatItCalculatesOvulation(){
	MensturationApp menstralCycle = new MensturationApp();
	String lastFlowDate = "2007-04-02";
	LocalDate ovulationDate = menstralCycle.calculateOvulation(lastFlowDate);
	String expected = "2007-04-16";
	LocalDate date = LocalDate.parse(expected);
	assertEquals(date,ovulationDate);

	}

	@Test
	public void testThatItCalculatesSafeDays(){
	MensturationApp menstralCycle = new MensturationApp();
	String lastFlowDate = "2007-04-02";
	LocalDate begining = menstralCycle.calculateSafeDaysBeginning(lastFlowDate);
	LocalDate ending = menstralCycle.calculateSafeDaysEnding(lastFlowDate);
	String expectedBegining = "2007-04-07";
	String expectedEnding = "2007-04-14";
	LocalDate date = LocalDate.parse(expectedBegining);
	LocalDate date2 = LocalDate.parse(expectedEnding);
	assertEquals(date,begining);
	assertEquals(date2,ending);

	}


}