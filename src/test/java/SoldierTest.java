import org.example.model.Location;
import org.example.model.Resources;
import org.example.model.Soldier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SoldierTest {

    private Soldier soldier1;
    private Soldier soldier2;

    @BeforeEach
    public void setup () {
        soldier1 = new Soldier(Location.Wall);
        soldier2 = new Soldier(Location.Wall);
    }

    @Test
    public void testGettingIronMakeSoldierStronger () {
        Assertions.assertEquals(5, soldier1.getStrength());
        soldier1.addResources(Resources.Iron);
        Assertions.assertEquals(7, soldier1.getStrength());
    }

    @Test
    public void testFighting () {
        Assertions.assertEquals(15, soldier1.getHealth());
        Assertions.assertEquals(15, soldier2.getHealth());
        soldier1.addResources(Resources.Iron);
        soldier1.attack(soldier2);
        Assertions.assertEquals(15, soldier1.getHealth());
        Assertions.assertEquals(14, soldier2.getHealth());
    }
}
