import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    // Метод, который добавляет номера в книгу
    public static void addNumber(String key, long value, Map<String, ArrayList<Long>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Long> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Long>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (long el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Long>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 89629993312L, bookPhone);
        addNumber("Ivanov", 89121232322L, bookPhone);
        addNumber("Petrov", 89172223331L, bookPhone);
        addNumber("Sidorov", 89561123322L, bookPhone);
        addNumber("Ivanov", 89122337577L, bookPhone);
        addNumber("Petrov", 89112223211L, bookPhone);
        printBook(bookPhone);
    }
}