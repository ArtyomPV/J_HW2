import java.io.IOException;
import java.util.HashMap;

public class Main {
     public static void main(String[] args) throws IOException {
        //        =========первая задача===================
        StringBuilder sb;

        Task1 data = new Task1();
        HashMap<String, String> keysAndValues = new HashMap<>();

        keysAndValues.put("name", "Ivanov");
        keysAndValues.put("country", "Russia");
        keysAndValues.put("city", "Moscow");
        keysAndValues.put("age", "null");

        System.out.println(keysAndValues);
        sb = data.getCondition(keysAndValues);
        System.out.println(sb);


//        ========= вторая задача ===================

        Task2 task2 = new Task2();
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        task2.bubbleSort(sortArr);
        for (int j : sortArr) {
            System.out.print(j + " ");
        }
    }
}