
public class FrogJmp {

    int distance = 0;
    int jumps = 0;

    public int solution(int X, int Y, int D){
        //x = starting position
        //y = target
        //d = jump distance

        distance = Y - X;

        jumps = distance / D;
        if (jumps < Y){
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(1,5,2) == 2 ? "Test passed" : "Test failed");
        System.out.println(frogJmp.solution(10, 85, 30) == 3 ? "Test passed" : "Test failed");
    }
}
