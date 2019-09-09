import org.junit.Before;
import org.junit.Test;
import staff.management.Director;


import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Paul", "JP549304B", 27000.00, "Production", 1000000);
    }

    @Test
    public void getName(){
        assertEquals("Paul", director.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JP549304B", director.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(27000.00, director.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(28350.00, director.raiseSalary(),0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(340.00, director.payBouns(), 0.01);
    }

    @Test
    public void getDepartName(){
        assertEquals("Production", director.getDepartName());
    }
    @Test
    public void getBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }
}
