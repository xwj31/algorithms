import java.util.Optional;

public class LongestHappyString {

    //cannot have aaa bbb ccc as a substring

    public String longestDiverseString(int a, int b, int c) {

        StringBuilder sb = new StringBuilder();
        int total=a+b+c;
        int currA=0,currB=0,currC=0;
        for(int i=0;i<total;i++){
            if((a>=b && a>=c && currA!=2) || (a>0 && (currB==2 || currC==2))){
                sb.append("a");
                a--;
                currA++;
                currB=0;
                currC=0;
            } else if((b>=a && b>=c && currB!=2) || (b>0 && ( currA==2 || currC==2))){
                sb.append("b");
                b--;
                currB++;
                currA=0;
                currC=0;
            } else if((c>=b && c>=a && currC!=2) || (c>0 && (currA==2 || currB==2))){
                sb.append("c");
                c--;
                currC++;
                currA=0;
                currB=0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LongestHappyString longestHappyString = new LongestHappyString();
        System.out.println(longestHappyString.longestDiverseString(1,1,7).equals("ccaccbcc") ? "Test passed" : "Test failed");
        System.out.println(longestHappyString.longestDiverseString(2,2,1).equals("aabbc") ? "Test passed" : "Test failed");
        System.out.println(longestHappyString.longestDiverseString(7,1,0).equals("aabaa") ? "Test passed" : "Test failed");
    }
}
