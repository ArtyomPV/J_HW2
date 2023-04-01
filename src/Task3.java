import java.io.*;
import java.util.ArrayList;

public class Task3 {
    String path = "file.json";


    Task3() throws IOException {
        File file = new File(path);
        FileReader fileRead = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileRead);
        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
        }
    }
    public ArrayList<String> readFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileRead = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileRead);
        ArrayList<String> array = new ArrayList<>();
        String str;
        while ((str = reader.readLine()) != null) {
            array.add(str);
        }
        for (String value: array) {
            System.out.println(value);
        }
        return array;
    }

    public  StringBuilder printLine(String line){
        String updateLine;
        updateLine = line.replace("[", "").replace("]", "").replace("{", "").replace("}", "").replace("\"","");
        StringBuilder newLine = new StringBuilder();
        String[] arrayInfo = updateLine.split(",");
        String[] listName = {"Студент ", " получил ", " по предмету "};
        for (int i = 0; i < arrayInfo.length; i++) {
            String[] arrData = arrayInfo[i].split(":");
            newLine.append(listName[i]).append(arrData[1]);
        }
        return newLine;
    }
}
