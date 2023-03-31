import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
    char action;
    double number1;
    double number2;

    Task4() throws IOException {
        Logger logger = startLogger();
        FileHandler file =  startFileHandler(logger);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите действие (+, -, *, /): ");
        action = sc.nextLine().charAt(0);
        logger.info("Введено действие: " + action);

        System.out.print("\nВведите первое число: ");
        number1 = sc.nextDouble();
        logger.info("Введено первое число: " + number1);
        System.out.print("\nВведите второе число: ");
        number2 = sc.nextDouble();
        logger.info("Введено второе число: " + number2);
        closeFileHandler(file);
    }


    public void Operations() throws IOException {
        Logger logger = startLogger();
        FileHandler file =  startFileHandler(logger);
        if (action == '+') {
            System.out.printf("\n%.2f %c %.2f = %.2f", number1, action, number2, number1 + number2);
            logger.info(String.valueOf(number1) + '+' + (number2) + '=' + (number1 + number2));
        } else if (action == '-') {
            System.out.printf("\n%.2f %c %.2f = %.2f", number1, action, number2, number1 - number2);
            logger.info(String.valueOf(number1) + '-' + (number2) + '=' + (number1 - number2));
        } else if (action == '*') {
            System.out.printf("\n%.2f %c %.2f = %.2f", number1, action, number2, number1 * number2);
            logger.info(String.valueOf(number1) + '*' + number2 + '=' + number1 * number2);
        } else if (action == '/') {
            if (number2 != 0) {
                System.out.printf("\n%.2f %c %.2f = %.2f", number1, action, number2, number1 / number2);
                logger.info(String.valueOf(number1) + '/' + number2 + '=' + number1 / number2);
            } else {
                System.out.print("\nНа ноль делить нельзя");
                logger.info("На ноль делить нельзя.");
            }

        } else {
            System.out.print("Действие не распознано.");
            logger.info("Действие не распознано.");
        }
        closeFileHandler(file);

    }



    private Logger startLogger(){
        Logger logger = Logger.getLogger(Task4.class.getName());
        logger.setLevel(Level.INFO);
        return logger;
    }

    private FileHandler startFileHandler(Logger logger) throws IOException {
        FileHandler file = new FileHandler("Task4log.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        return file;
    }
    private void closeFileHandler(FileHandler file) {
        file.close();
    }

}
