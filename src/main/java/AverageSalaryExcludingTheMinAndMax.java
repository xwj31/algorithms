import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryExcludingTheMinAndMax {

    public double average(int[] salary) {

        List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());

        Integer min = Arrays.stream(salary).min().getAsInt();
        Integer max = Arrays.stream(salary).max().getAsInt();

        list.remove(min);
        list.remove(max);

        return list.stream().reduce(0, Integer::sum) / (double)list.size();
    }

    public static void main(String[] args) {
        AverageSalaryExcludingTheMinAndMax averageSalaryExcludingTheMinAndMax = new AverageSalaryExcludingTheMinAndMax();
        System.out.println(averageSalaryExcludingTheMinAndMax.average(new int[]{8000, 9000, 2000, 3000, 6000, 1000}) == 4750.00000 ? "Test passed" : "Test failed");
        System.out.println(averageSalaryExcludingTheMinAndMax.average(new int[]{4000, 3000, 1000, 2000}) == 2500.00000 ? "Test passed" : "Test failed");
        System.out.println(averageSalaryExcludingTheMinAndMax.average(new int[]{1000, 2000, 3000}) == 2000.00000 ? "Test passed" : "Test failed");
    }
}
