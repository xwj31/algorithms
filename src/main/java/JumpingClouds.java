public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int step = c[0];
        int pointInIndex = 1;

        while (pointInIndex <= c.length) {
            if (pointInIndex+2 < c.length) {
                if (c[pointInIndex+2] == 0) {
                    step++;
                    pointInIndex = pointInIndex + 2;
                } else if (c[pointInIndex+1] == 0){
                step++;
                pointInIndex++;
            }}
        }

        return step;
    }

    public static void main(String[] args) {
        int[] c = new int[]{0,0,1,0,0,1,0};
        int result = jumpingOnClouds(c);
        if (result == 4){
            System.out.println("test passed");
        } else{
            System.out.println("Test failed: " + result);
        }

        int[] d = new int[]{0,0,0,0,1,0};
        int secondResult = jumpingOnClouds(d);

        if (secondResult == 3) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed: " + secondResult);
        }
    }
}

