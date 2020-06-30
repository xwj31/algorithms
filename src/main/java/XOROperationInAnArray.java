public class XOROperationInAnArray {

    public int xorOperation(int n , int start) {

        int[] workingArray = new int[n];
        int workingOutput = 0;

        for (int i = 0; i < n; i++) {
                workingArray[i] =  start + i * 2;
        }

        for (int i = 0; i < workingArray.length; i++) {
            workingOutput = workingOutput ^ workingArray[i];
        }

        return workingOutput;
    }

    public static void main(String[] args) {
        XOROperationInAnArray xorOperationInAnArray = new XOROperationInAnArray();
        System.out.println(xorOperationInAnArray.xorOperation(5, 0) == 8 ? "Test passed" : "Test failed");
        System.out.println(xorOperationInAnArray.xorOperation(4, 3) == 8 ? "Test passed" : "Test failed");
        System.out.println(xorOperationInAnArray.xorOperation(1, 7) == 7 ? "Test passed" : "Test failed");
        System.out.println(xorOperationInAnArray.xorOperation(10, 5) == 2 ? "Test passed" : "Test failed");
    }

}
