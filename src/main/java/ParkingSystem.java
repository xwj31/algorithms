import java.util.EmptyStackException;
import java.util.Stack;

public class ParkingSystem {

    Stack<Integer> bigStack;
    Stack<Integer> mediumStack;
    Stack<Integer> smallStack;

    public ParkingSystem(int big, int medium, int small) {

        bigStack = new Stack<>();
        mediumStack = new Stack<>();
        smallStack = new Stack<>();

        for (int i = 0; i < big; i++) {
            bigStack.push(i);
        }

        for (int i = 0; i < medium; i++) {
            mediumStack.push(i);
        }

        for (int i = 0; i < small; i++) {
            smallStack.push(i);
        }
    }

    // big car = 3, medium car = 2, small car = 1
    public boolean addCar(int carType) {

        if (carType == 3) {
            try {
                bigStack.pop();
                return true;
            } catch (EmptyStackException e) {
                return false;
            }

        }
        if (carType == 2) {
            try {
                mediumStack.pop();
                return true;
            } catch (EmptyStackException e) {
                return false;
            }

        }
        if (carType == 1) {
            try {
                smallStack.pop();
                return true;
            } catch (EmptyStackException e) {
              return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        System.out.println(parkingSystem.addCar(1) ? "Test Failed" : "Test passed");
    }
}
