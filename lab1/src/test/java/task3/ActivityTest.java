package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ActivityTest {
    private Activity activity;

    @BeforeEach
    void init() {
        this.activity = new Activity(Activity.ActivityType.STANDING);
    }

    @Test
    void instantiationTest() {
        assertNotNull(activity);
        assertEquals(activity.getType(), Activity.ActivityType.STANDING);
    }

    @Test
    void changeTypeTest() {
        assertNotNull(activity);
        assertEquals(activity.getType(), Activity.ActivityType.STANDING);
        activity.setType(Activity.ActivityType.SITTING);
        assertEquals(activity.getType(), Activity.ActivityType.SITTING);
    }
}
