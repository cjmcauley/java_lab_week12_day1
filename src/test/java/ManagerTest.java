import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "JP856920A", 30000.89, "Marketing");
    }

    @Test
    public void getDepartName(){
        assertEquals("Marketing", manager.getDepartName());
    }

    @Test
    public void getManagerName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JP856920A", manager.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(30000.89, manager.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(31500.93, manager.raiseSalary(),0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(300.00, manager.payBouns(), 0.01);
    }

}
