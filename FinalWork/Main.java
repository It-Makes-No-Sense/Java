package FinalWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToysDispenser toysDispenser = new ToysDispenser();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Меню:
                    1 - Добавить новую игрушку
                    2 - Провести розыгрыш с сохранением результата
                    3 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> toysDispenser.addToy();
                case "2" -> toysDispenser.playToys();
                case "3" -> {
                    System.out.println("До новых встреч!");
                    System.exit(4);
                }
                default -> System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}
