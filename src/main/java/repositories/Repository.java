package repositories;

public interface Repository <T, R> {
    void add(T t);
    void remove(T t);
    void move(T t, R r);
}
