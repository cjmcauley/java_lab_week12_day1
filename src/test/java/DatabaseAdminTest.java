import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Juan", "JP578304A", 21000.00);
    }

    @Test
    public void getName(){
        assertEquals("Juan", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JP578304A", databaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(21000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(22050.00, databaseAdmin.raiseSalary(),0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(210.00, databaseAdmin.payBouns(), 0.01);
    }

    @Test
    public void dontChangeNameWhenNull() {
        databaseAdmin.setName("");
        assertEquals("Juan", databaseAdmin.getName());
    }

    @Test
    public void changeName() {
        databaseAdmin.setName("John");
        assertEquals("John", databaseAdmin.getName());
    }


}
