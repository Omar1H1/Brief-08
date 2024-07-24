import org.example.model.Resources;
import org.example.model.Villager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VillagerTest {

    private Villager villager;

    @BeforeEach
    public void setup () {
        villager = new Villager();
    }

    @Test
    public void testVillagerInitStats() {
        assertEquals(10, villager.getHealth());
        assertEquals(0, villager.getStrength());
        assertEquals(0, villager.getFood());
        assertEquals(0, villager.getRock());
        assertEquals(0, villager.getIron());
        assertEquals(0, villager.getWood());
    }

    @Test
    public void testVillagerAddingStats() {
        villager.addResources(Resources.Food);
        assertEquals(1,villager.getFood());
        assertEquals(0, villager.getRock());
        assertEquals(10, villager.getHealth());
    }

    @Test
    public void testVillagerTakingDamage() {
        int count = 10;

        while (count > 0) {
            villager.TakeDamage();
            count--;
        }
        assertEquals(0,villager.getHealth());
    }
}