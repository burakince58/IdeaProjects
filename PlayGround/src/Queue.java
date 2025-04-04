import java.util.Arrays;
public class Queue {
    private int first, last;
    private Object[] array;

    public Queue() {
        first = last = -1;
        array = new Object[4];
    }

    public void enqueue(Object element) {
        if (first == -1) {
            first = 0;
            last = 0;
        } else {
            int length = array.length;
            last = (last + 1) % length;
            if (last == first) {// queue full
                Object[] newArray = new Object[2 * length];
                for (int i = 0; i < length; i++) {
                    newArray[i] = array[(first + i) % length];
                }
                first = 0;
                last = length;
                array = newArray;
            }
        }
        array[last] = element;
    }

    public Object dequeue() { // assumption: first != −1
        Object result = array[first];
        if (first == last) {
            first = -1;
            last = -1;
        } else {
            first = (first + 1) % array.length;
        }
        return result;
    }

    public boolean isEmpty() {
        return first == -1;
    }

    public String toString() {
        return Arrays.toString(array);
    }

}

