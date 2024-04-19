package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EmotionalStateTest {
    private EmotionalState emotionalState;
    @BeforeEach
    void initState() {
        this.emotionalState = new EmotionalState(EmotionalState.EmotionalStateType.FRUSTRATED);
    }

    @Test
    void instantiationTest() {
        assertNotNull(emotionalState);
        assertEquals(emotionalState.getState(), EmotionalState.EmotionalStateType.FRUSTRATED);
    }

    @Test
    void setStateTest() {
        assertNotNull(emotionalState);
        assertEquals(emotionalState.getState(), EmotionalState.EmotionalStateType.FRUSTRATED);
        emotionalState.setState(EmotionalState.EmotionalStateType.SHOCKED);
        assertEquals(emotionalState.getState(), EmotionalState.EmotionalStateType.SHOCKED);
    }
}
