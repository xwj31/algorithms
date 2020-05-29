public class PrintInOrder {

    volatile int a; //volatile updates var across all threads in a multi core cpu

    public PrintInOrder() {
        a = 1;
    }


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        while(a!=1);
        printFirst.run();
        a=2;
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while(a!=2);
        printSecond.run();
        a=3;
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while(a!=3);
        printThird.run();
    }

    public static void main(String[] args) {
        PrintInOrder printInOrder = new PrintInOrder();
    }
}
