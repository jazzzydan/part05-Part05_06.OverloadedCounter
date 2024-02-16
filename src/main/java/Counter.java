public class Counter {
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter () {
        this(0);
    }

    public int value() {
        return startValue;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.startValue = this.startValue + increaseBy;
    }
    public void increase() {
        this.startValue++;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.startValue = this.startValue - decreaseBy;
    }

    public void decrease() {
        this.startValue--;
    }
}
