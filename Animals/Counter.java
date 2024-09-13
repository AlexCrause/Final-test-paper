package Animals;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public Counter() {
        this.count = 0;
        this.closed = false;
    }

    // Метод для увеличения счётчика
    public void add() {
        if (closed) {
            throw new IllegalStateException("Счётчик закрыт и не может быть использован.");
        }
        count++;
    }

    // Метод для получения текущего значения счётчика
    public int getCount() {
        if (closed) {
            throw new IllegalStateException("Счётчик закрыт.");
        }
        return count;
    }

    // Реализация метода close() из интерфейса AutoCloseable
    @Override
    public void close() {
        if (closed) {
            throw new IllegalStateException("Счётчик уже закрыт.");
        }
        closed = true;
    }
}
