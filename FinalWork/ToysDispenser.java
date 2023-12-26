package FinalWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class ToysDispenser {
    static ArrayList<Toy> toys = new ArrayList<>();
    static PriorityQueue<Toy> toys_prizes = new PriorityQueue<>();
    static int id = 0;

    public void addToy() {
        Scanner sc = new Scanner(System.in);
        String name;
        int drop_chance;
        while (true) {
            System.out.print("Введите название: ");
            name = sc.nextLine();
            if (name.isEmpty()) {
                System.out.println("Некорректный ввод. Повторите снова.");
                break;
            }
            System.out.print("Введите частоту выпадения где 1(10% шанс): ");
            if (sc.hasNextInt()) {
                drop_chance = sc.nextInt();
                if (drop_chance <= 0) {
                    System.out.println("Некорректный ввод. Повторите снова.");
                } else {
                    Toy toy = new Toy(id, name, drop_chance);
                    if (!toys.contains(toy)) {
                        id++;
                        toys.add(toy);
                        System.out.println("Была добавлена новая игрушка");
                    } else {
                        System.out.println("Эта игрушка уже есть в призовом фонде.");
                    }
                }
            } else {
                System.out.println("Некорректный ввод. Повторите снова.");
            }
            break;
        }
    }

    private Toy getPrize() {
        if (toys_prizes.isEmpty()) {
            Random rnd = new Random();
            for (Toy toy : toys) {
                for (int i = 0; i < toy.drop_chance; i++) {
                    Toy temp = new Toy(toy.id, toy.name, rnd.nextInt(1, 10));
                    toys_prizes.add(temp);
                }
            }
        }
        return toys_prizes.poll();
    }

    public void playToys() {
        if (toys.size() >= 2) {
            Toy prize = getPrize();
            System.out.println("Приз: " + prize.name);
            saveResult(String.format("ID:%d Название:%s", prize.id, prize.name));
        } else {
            System.out.println("Вы должны добавить в призовой фонд как минимум две игрушки.");
        }
    }

    private void saveResult(String text) {
        File file = new File("Result.txt");
        try {
            file.createNewFile();
        } catch (Exception ignored) {
            throw new RuntimeException();
        }
        try (FileWriter fw = new FileWriter("Result.txt", true)) {
            fw.write(text + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
