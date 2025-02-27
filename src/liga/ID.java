package liga;

import java.util.concurrent.atomic.AtomicInteger;

abstract class ID {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;

    public ID() {
        this.id = count.getAndIncrement();
    }

    @Override
    public String toString() {
        return "";
    }
}
