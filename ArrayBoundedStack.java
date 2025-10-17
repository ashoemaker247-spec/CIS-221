package Assignment6;

public class ArrayBoundedStack<T> implements StackInterface<T> {

    protected final int DECAP = 100;
    protected T[] elements;
    protected int topIndex = -1;

    public ArrayBoundedStack() {
        elements = (T[]) new Object[DECAP];
    }

    public ArrayBoundedStack(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    @Override
    public void push(T element) {

    }

    @Override
    public void pop() {

    }

    @Override
    public T top() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}