import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1, 2, 3");
        System.out.println("Введите свою фамилию");
        Scanner surname = new Scanner(System.in);
        String lastName = surname.nextLine();
        System.out.println("Введите свое имя");
        Scanner name = new Scanner(System.in);
        String firstName = name.nextLine();
        System.out.println("Введите свое отчество");
        Scanner patronymic = new Scanner(System.in);
        String middleName = patronymic.nextLine();
        String fullName = String.join(lastName + " ", firstName + " ",
                middleName);
        String fullNameToUpperCase = fullName.toUpperCase();
        if (fullNameToUpperCase.contains("Ё")) {
            String fullNameToUpperCaseTwo = fullNameToUpperCase.replace('Ё', 'Е');
            System.out.println();
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета: " +
                    fullNameToUpperCaseTwo);
        } else {
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета: " +
                    fullNameToUpperCase);
        }
    }
}