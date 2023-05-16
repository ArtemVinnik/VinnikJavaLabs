package edu.nmu.vinnik;

import edu.nmu.vinnik.lab4.JsonManager;
import edu.nmu.vinnik.lab4.Run;
import edu.nmu.vinnik.lab4.models.University;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @org.junit.jupiter.api.Test
    public void universityToJson() {
        Run run = new Run();
        University oldUniversity = run.createTypicalUniversity();

        JsonManager.writeToJsonFile(oldUniversity, "C:\\oldUniversity.json");

        University newUniversity = JsonManager.readFromJsonFile("C:\\oldUniversity.json");

        assertEquals(oldUniversity, newUniversity);
    }
}
