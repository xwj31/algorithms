///*
//
//Write a comparator to sort a list of tuples as per a given sort spec.  A tuple is a list of Comparables, some or all of
//which could be null. A sort spec specifies whether to sort a particular index in the tuple in ascending or descending order.
//Please note tuples may not necessarily be of the same size.
//
//The comparator needs to sort the tuples by first comparing the elements in the first position, and then sort the ordered
//tuples by comparing the elements in the second position and so on.
//
//The comparator needs to be null-friendly, such that it always ensures null to be greater than non-null within each index
//of the tuple regardless of the sort spec for that index.
//
//The comparator also needs to ensure that a m-tuple is greater than a n-tuple if m>n and if the first n elements of the m-tuple are equal to the n-tuple.
//
//"test()" is a failing unit test that has examples of lists of 3-tuples (of String) and sort specs.
//
//Ideally you:
//
//  1) Implement the "compare" method in the Comp class to make the "test" pass - please note that compare method takes 2 tuples as its arguments.
//  2) Ensure the "compare" method conforms to the specification of java.util.Comparator#compare(T o1, T o2)
//  3) Resolve the compiler warnings associated with the “Comp” class
//
//The exercise is typical of the kind of data manipulation tasks you might have to perform.
//There is no fixed time limit for completing the exercise, but it is timed and we would anticipate you should be able to
//complete this with 1.5 hours of beginning the exercise. There is no need to submit as the tool automatically saves your work and allows us to replay.
//Let us know when you're finished and we'll review your work.
//*/
//
//import org.junit.*;
//import org.junit.runner.*;
//
//import java.util.*;
//import java.util.function.Function;
//
///*
// * To execute Java, please define "static void main" on a class
// * named Solution.
// *
// * If you need more classes, simply define them inline.
// */
//
//public class Solution {
//
//    public static void main(String[] args) {
//        JUnitCore.main("Solution");
//    }
//
//    class Comp<T extends List<? extends Comparable>> implements Comparator<List<? extends Comparable>> {
//
//        private final boolean[] order;
//
//        public Comp(List<Map<String, String>> sortSpec) {
//            order = new boolean[sortSpec.size()];
//            for(int i = 0; i < sortSpec.size(); i++) {
//                order[i] = "ascending".equals(sortSpec.get(i).get("direction"));
//            }
//        }
//
//        @Override
//        public int compare(List<? extends Comparable> o1, List<? extends Comparable> o2) {
//
//            //doesn't work, ran out of time
//            int firstCompare = nullSafeStringComparator.compare((String)o1.get(0),(String)o2.get(0));
//            int secondCompare = nullSafeStringComparator.compare((String)o1.get(1),(String)o2.get(1));
//            int thirdCompare = nullSafeStringComparator.compare((String)o1.get(2),(String)o2.get(2));
//
//            if (firstCompare == 0) {
//                if (secondCompare == 0) {
//                    return thirdCompare;
//                }
//                return secondCompare;
//            }
//            return firstCompare;
//        }
//    }
//
//    public static Comparator<String> nullSafeStringComparator = Comparator
//            .nullsLast(String::compareToIgnoreCase);
//
//    @Test
//    public void test() {
//        //list of 3-tuple of Strings to be sorted
//        List<List<String>> stream = new ArrayList<>();
//        stream.add(Arrays.asList(null,"EMEA","TradeWeb"));
//        stream.add(Arrays.asList("American Express","EMEA",null));
//        stream.add(Arrays.asList("BNP","ASIA",null));
//        stream.add(Arrays.asList("American Express","EUROPE",null));
//        stream.add(Arrays.asList("American Express",null,null));
//        stream.add(Arrays.asList("Bluecrest","EUROPE",null));
//        stream.add(Arrays.asList("Bluecrest","ASIA",null));
//        stream.add(Arrays.asList("BNP","ASIA","Reuters"));
//        stream.add(Arrays.asList("Bluecrest","EUROPE","Reuters"));
//        stream.add(Arrays.asList("American Express","EMEA",null));
//
//        Map<String,String> clientSpec = getMap("ascending");
//        Map<String,String> regionSpec = getMap("ascending");
//        Map<String,String> venueSpec = getMap("ascending");
//
//        //sort spec for 3-tuples in the list
//        List<Map<String, String>> sortSpec = Arrays.asList(clientSpec, regionSpec, venueSpec);
//        Comparator<List<String>> comp = new Comp(sortSpec);
//
//        List<List<String>> expected = new ArrayList<>();
//
//        expected.add(Arrays.asList("American Express","EMEA",null));
//        expected.add(Arrays.asList("American Express","EMEA",null));
//        expected.add(Arrays.asList("American Express","EUROPE",null));
//        expected.add(Arrays.asList("American Express",null,null));
//        expected.add(Arrays.asList("BNP","ASIA","Reuters"));
//        expected.add(Arrays.asList("BNP","ASIA",null));
//        expected.add(Arrays.asList("Bluecrest","ASIA",null));
//        expected.add(Arrays.asList("Bluecrest","EUROPE","Reuters"));
//        expected.add(Arrays.asList("Bluecrest","EUROPE",null));
//        expected.add(Arrays.asList(null,"EMEA","TradeWeb"));
//
//        Collections.sort(stream, comp);
//        Assert.assertEquals(expected, stream);
//
//        //flip sort order for the first item in tuple from ascending to descending
//        clientSpec = getMap("descending");
//        sortSpec = Arrays.asList(clientSpec, regionSpec, venueSpec);
//        comp = new Comp(sortSpec);
//
//        expected.clear();
//        expected.add(Arrays.asList("Bluecrest","ASIA",null));
//        expected.add(Arrays.asList("Bluecrest","EUROPE","Reuters"));
//        expected.add(Arrays.asList("Bluecrest","EUROPE",null));
//        expected.add(Arrays.asList("BNP","ASIA","Reuters"));
//        expected.add(Arrays.asList("BNP","ASIA",null));
//        expected.add(Arrays.asList("American Express","EMEA",null));
//        expected.add(Arrays.asList("American Express","EMEA",null));
//        expected.add(Arrays.asList("American Express","EUROPE",null));
//        expected.add(Arrays.asList("American Express",null,null));
//        expected.add(Arrays.asList(null,"EMEA","TradeWeb"));
//
//        Collections.sort(stream, comp);
//        Assert.assertEquals(expected, stream);
//    }
//
//    public Map<String, String> getMap(String order) {
//        Map<String, String> spec = new HashMap<>();
//        spec.put("direction", order);
//        return spec;
//    }
//}