import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {

        Set<String> origins = new HashSet<>();
        Set<String> destinations = new HashSet<>();
        paths.forEach(path -> {
            origins.add(path.get(0));
            destinations.add(path.get(1));
        });
        return destinations.stream()
                .filter(destination -> !origins.contains(destination))
                .findFirst()
                .get();
    }


    public static void main(String[] args) {
        DestinationCity destinationCity = new DestinationCity();
        List<List<String>> inputList1 = new ArrayList<>();
        inputList1.add(List.of("London", "New york"));
        inputList1.add(List.of("New York", "Lima"));
        inputList1.add(List.of("Lima", "Sao Paulo"));
        System.out.println(destinationCity.destCity(inputList1).equals("Sao Paulo") ? "Test passed": "Test failed");

        List<List<String>> inputList2 = new ArrayList<>();
        inputList2.add(List.of("B", "C"));
        inputList2.add(List.of("D", "B"));
        inputList2.add(List.of("C", "A"));
        System.out.println(destinationCity.destCity(inputList2).equals("A") ? "Test passed": "Test failed");

        List<List<String>> inputList3 = new ArrayList<>();
        inputList3.add(List.of("A", "Z"));
        System.out.println(destinationCity.destCity(inputList3).equals("Z") ? "Test passed": "Test failed");
    }
}
