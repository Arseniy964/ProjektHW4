import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> A = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }

        System.out.println("Список A: " + A);

        List<String> B = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }

        System.out.println("Список B: " + B);

        List<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(4 - i));
        }
        
        System.out.println("Список C: " + C);

        Collections.sort(C, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C по длине строки: " + C);
    }
}