package task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {
    private final Activity activity = new Activity(Activity.ActivityType.STANDING);
    private final EmotionalState emotionalState = new EmotionalState(EmotionalState.EmotionalStateType.FRUSTRATED);

    @Test
    void instantiationTest() {
        Person person = new Person(
                Person.PersonType.REGULAR,
                activity,
                emotionalState
        );
        assertNotNull(person);
        assertEquals(person.getType(), Person.PersonType.REGULAR);
        assertEquals(person.getActivity().getType(), Activity.ActivityType.STANDING);
        assertEquals(person.getEmotionalState().getState(), EmotionalState.EmotionalStateType.FRUSTRATED);
    }

    @Test
    void changePersonPropertiesTest() {
        Person person = new Person(
                Person.PersonType.REGULAR,
                activity,
                emotionalState
        );
        assertNotNull(person);
        assertEquals(person.getType(), Person.PersonType.REGULAR);
        assertEquals(person.getActivity().getType(), Activity.ActivityType.STANDING);
        assertEquals(person.getEmotionalState().getState(), EmotionalState.EmotionalStateType.FRUSTRATED);

        person.setActivity(new Activity(Activity.ActivityType.SITTING));
        person.setEmotionalState(new EmotionalState(EmotionalState.EmotionalStateType.SHOCKED));
        assertEquals(person.getActivity().getType(), Activity.ActivityType.SITTING);
        assertEquals(person.getEmotionalState().getState(), EmotionalState.EmotionalStateType.SHOCKED);
    }

    @Test
    void checkTwoHeadedPersonTypeTest() {
        Person person = new Person(Person.PersonType.TWO_HEADED);
        assertNotNull(person);
        assertEquals(person.getType(), Person.PersonType.TWO_HEADED);
        assertEquals(person.getActivity().getType(), Activity.ActivityType.PICKING);
        assertEquals(person.getEmotionalState().getState(), EmotionalState.EmotionalStateType.RELAXED);
    }

    @Test
    void checkRegularPersonWithNoPropertiesTest() {
        Person person = new Person(Person.PersonType.REGULAR);
        assertNotNull(person);
        assertEquals(person.getType(), Person.PersonType.REGULAR);
        assertNull(person.getActivity());
        assertNull(person.getEmotionalState());
    }
}
