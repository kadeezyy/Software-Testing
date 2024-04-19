package task3;

public class Activity {
    private ActivityType type;

    public Activity(ActivityType type) {
        this.type = type;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    enum ActivityType {
        SITTING,
        STANDING,
        PICKING
    }
}
