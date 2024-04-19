package task3;

public class Person {
    private final PersonType type;
    private Activity activity;
    private EmotionalState emotionalState;

    public Person(PersonType type, Activity activity, EmotionalState emotionalState) {
        this.type = type;
        this.activity = activity;
        this.emotionalState = emotionalState;
    }
    public Person(PersonType type) {
        this.type = type;
        if (type == PersonType.TWO_HEADED) {
            emotionalState = new EmotionalState(EmotionalState.EmotionalStateType.RELAXED);
            activity = new Activity(Activity.ActivityType.PICKING);
        }
    }

    public PersonType getType() {
        return type;
    }

    public Activity getActivity() {
        return activity;
    }

    public EmotionalState getEmotionalState() {
        return emotionalState;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setEmotionalState(EmotionalState state) {
        this.emotionalState = state;
    }

    enum PersonType {
        TWO_HEADED,
        REGULAR
    }
}