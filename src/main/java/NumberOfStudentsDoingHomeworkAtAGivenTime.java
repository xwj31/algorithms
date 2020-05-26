import java.util.ArrayList;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public int busyStudent(int [] startTime, int[] endTime, int queryTime) {

        ArrayList<Integer> workingArray = new ArrayList<>();
        int numberOfStudentsWorking = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime) {
                workingArray.add(i);
            }
        }
        for (Integer studentsStarted: workingArray) {
            if (endTime[studentsStarted] >= queryTime) {
                numberOfStudentsWorking++;
            }
        }
        return numberOfStudentsWorking;
    }

    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime numberOfStudentsDoingHomeworkAtAGivenTime
                = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        System.out.println(numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4) == 1 ? "Test passed": "Test failed");
        System.out.println(numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{4}, new int[]{4}, 4) == 1 ? "Test passed": "Test failed");
        System.out.println(numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{4}, new int[]{4}, 5) == 0 ? "Test passed": "Test failed");
        System.out.println(numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{1,1,1,1}, new int[]{1,3,2,4}, 7) == 0 ? "Test passed": "Test failed");
        System.out.println(numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 5) == 5 ? "Test passed": "Test failed");
    }
}
