import java.io.IOException;
import java.util.ArrayList;

public class Main {
     public static void main(String[] args) throws IOException {
        //        =========первая задача===================
//        StringBuilder sb;

//        Task1 data = new Task1();
//        HashMap<String, String> keysAndValues = new HashMap<>();
//
//        keysAndValues.put("name", "Ivanov");
//        keysAndValues.put("country", "Russia");
//        keysAndValues.put("city", "Moscow");
//        keysAndValues.put("age", "null");
//
//        System.out.println(keysAndValues);
//        sb = data.getCondition(keysAndValues);
//        System.out.println(sb);


//        ========= вторая задача ===================

//        Task2 task2 = new Task2();
//        int[] sortArr = {12, 6, 4, 1, 15, 10};
//        task2.bubbleSort(sortArr);
//        for (int j : sortArr) {
//            System.out.print(j + " ");
//        }

//        =========  четвертая задача ===================
//        Task4 task4 = new Task4();
//        task4.Operations();

//        =========  третья задача ===================
         String path = "file.json";
         Task3 task3 = new Task3();
         ArrayList<String> array = task3.readFromFile(path);
         for (String value: array) {
             System.out.println(task3.printLine(value));
         }






     }


}