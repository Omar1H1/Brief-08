import org.example.model.Forger;

import org.example.model.Forgery;
import org.example.model.Resources;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForgerTest {

    private Forger forger;

    @BeforeEach
    public void setUp() {
        forger = new Forger();
    }

    @Test
    public void testForgerInitStats () {
        assertEquals(10, forger.getHealth());
        assertEquals(0, forger.getStrength() );
        assertEquals(0, forger.getFood());
        assertEquals(0, forger.getIron());
        assertEquals(0, forger.getWood());
        assertEquals(0, forger.getRock());
        assertEquals(0, forger.getWepeansNumber());
    }

    @Test
    public void testForgerAddingStats () {
        assertEquals(0, forger.getIron());

        forger.addResources(Resources.Iron);

        assertEquals(1, forger.getIron());
    }

    @Test
    public void testForgerCreatingWepeans() {
        assertEquals(0, forger.getWepeansNumber());
        forger.addResources(Resources.Iron);
        Forgery forgery = new Forgery();
        forgery.CreateSword(forger);
        assertEquals(1, forger.getWepeansNumber());
    }

}
