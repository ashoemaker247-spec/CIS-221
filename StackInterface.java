package Assignment6;

public interface StackInterface<T> {
    void push(T element);
    void pop();
    T top();
    boolean isEmpty();
    boolean isFull();
}
