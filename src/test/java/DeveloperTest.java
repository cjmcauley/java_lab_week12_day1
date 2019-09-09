import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jarrod", "JP549304A", 24000.00);
    }

    @Test
    public void getName(){
        assertEquals("Jarrod", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JP549304A", developer.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(24000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(25200.00, developer.raiseSalary(),0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(240.00, developer.payBouns(), 0.01);
    }

}
