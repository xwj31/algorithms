import java.util.ArrayList;

public class StackUsingArray {

    public static void main(String[] args) {

    }

    static class Stack{

        ArrayList<Integer> arrayList;
        int index = 0;
        int size;

        public Stack(int size) {
             arrayList = new ArrayList(size);
        }

        public int pop() {
            return arrayList.get(index);
        }

        public void push(Integer element) {
            index++;
            arrayList.add(index, element);
        }

        public boolean isEmpty() {
            return index == 0;
        }

        public boolean isFull() {
            return index == size;
        }
    }
}
