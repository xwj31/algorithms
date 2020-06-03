public class HammingDistance {

    public int hammingDistance(int x, int y) {

        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1,4) == 2 ? "Test passed" : "Test failed");
    }
}
