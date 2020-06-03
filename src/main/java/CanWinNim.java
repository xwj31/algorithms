public class CanWinNim {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        CanWinNim canWinNim = new CanWinNim();
        System.out.println(!canWinNim.canWinNim(4) ? "Test passed" : "Test failed");
    }

}
