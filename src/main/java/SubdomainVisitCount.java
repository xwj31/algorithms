import java.util.*;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> workingArray = new ArrayList<>(Arrays.asList(cpdomains));
        HashMap<String, Integer> workingMap = new HashMap<>();

        for (int i = 0; i < workingArray.size(); i++) {

            List<String> workingArrayPerItem = new ArrayList<>(Arrays.asList(workingArray.get(i).split(" ")));
            int numberOfVisits = Integer.parseInt(workingArrayPerItem.get(0));

            String[] domainsByLevel = workingArrayPerItem.get(1).split("\\.");

            workingMap.put(domainsByLevel[domainsByLevel.length-1], numberOfVisits);

            if (domainsByLevel.length > 2) {
                workingMap.put(domainsByLevel[domainsByLevel.length-2]+"."+domainsByLevel[domainsByLevel.length-1], numberOfVisits);
            }

            workingMap.put(workingArrayPerItem.get(1), numberOfVisits);

        }

        return null;
    }

    public static void main(String[] args) {
        SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();
        System.out.println(Objects.equals(subdomainVisitCount.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}), new String[]{"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"}) ? "Test passed" : "Test failed");
        System.out.println(Objects.equals(subdomainVisitCount.subdomainVisits(new String[]{"901 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}), new String[]{"901 mail.com, 50 yahoo.com", "900 google.mail.com", "5 wiki.org", "5 org", "1 intel.mail.com", "951 com"}) ? "Test passed" : "Test failed");
    }
}
