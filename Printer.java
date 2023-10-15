import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int min = 0;
        int max = 0;
        int avg = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            avg += arr[i];
        }
        System.out.println(list);
        System.out.printf("Minimum is %d%n",min);
        System.out.printf("Maximum is %d%n",max);
        System.out.printf("Average is = %d%n",avg/list.size());
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}