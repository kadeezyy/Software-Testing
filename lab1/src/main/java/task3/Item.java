package task3;

import java.time.LocalDate;

public class Item {
    private final ItemType type;
    private final LocalDate manufacturingDate;

    public Item(ItemType type, LocalDate manufacturingDate) {
        this.type = type;
        this.manufacturingDate = manufacturingDate;
    }

    public Item(ItemType type) {
        this.type = type;
        manufacturingDate = LocalDate.now();
    }

    public ItemType getType() {
        return type;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    enum ItemType {
        CHAIR,
        REMOTE_CONTROL
    }
}
