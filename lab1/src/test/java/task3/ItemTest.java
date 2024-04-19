package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ItemTest {
    private Random random;
    @BeforeAll
    void init() {
        random = new Random();
    }
    @Test
    void instantiationTest() {
        Item item = new Item(Item.ItemType.CHAIR);
        assertNotNull(item);
        assertEquals(item.getManufacturingDate(), LocalDate.now());
        assertEquals(item.getType(), Item.ItemType.CHAIR);
    }

    @RepeatedTest(5)
    void itemInstantiationWithManufacturingDateTest() {
        LocalDate manufacturingDate = getRandomDate();
        Item item = new Item(Item.ItemType.REMOTE_CONTROL, manufacturingDate);
        assertNotNull(item);
        assertEquals(item.getManufacturingDate(), manufacturingDate);
        assertEquals(item.getType(), Item.ItemType.REMOTE_CONTROL);
    }

    private LocalDate getRandomDate() {
        long minDay = LocalDate.of(1980, 1, 1).toEpochDay();
        long maxDay = LocalDate.now().toEpochDay();
        long randomDay = random.nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
