import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

        String pathFile = "task2.txt";

        public void writeFile(int element, int element2, int count) throws IOException {
            File fileLog = new File(pathFile);
            FileWriter fileWriter = new FileWriter(fileLog, true);
            fileWriter.write("Выполнено ");
            fileWriter.write(count + " ");
            fileWriter.write("действие:  ");
            fileWriter.write(element + " ");
            fileWriter.write("заменили на  ");
            fileWriter.write(element2 + "\n");
            fileWriter.flush();
            fileWriter.close();
        }

    public void writeFileFirstLine() throws IOException {
        File fileLog = new File(pathFile);
        FileWriter fileWriter = new FileWriter(fileLog);
        fileWriter.write(" ");

        }


        public void bubbleSort(int[] sortArr) throws IOException {
            writeFileFirstLine();
            int count = 1;
            for (int i = 0; i < sortArr.length - 1; i++) {
                for(int j = 0; j < sortArr.length - i - 1; j++) {
                    if(sortArr[j + 1] < sortArr[j]) {
                        int swap = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = swap;
                        writeFile(sortArr[j], sortArr[j + 1], count);
                        count ++;
                    }
                }
            }
        }


        }


