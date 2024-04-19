package task3;

public class EmotionalState {
    private EmotionalStateType state;

    public EmotionalState(EmotionalStateType state) {
        this.state = state;
    }

    public void setState(EmotionalStateType state) {
        this.state = state;
    }

    public EmotionalStateType getState() {
        return state;
    }

    enum EmotionalStateType {
        FRUSTRATED,
        SHOCKED,
        RELAXED
    }
}
