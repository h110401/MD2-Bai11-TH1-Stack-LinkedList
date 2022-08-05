import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private final LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<T>();
    }

    public void push(T e) {
        stack.addFirst(e);
    }

    public T pop() {
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
