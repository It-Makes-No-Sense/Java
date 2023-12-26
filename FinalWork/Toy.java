package FinalWork;

public class Toy implements Comparable<Toy>{
    Integer id;
    String name;
    Integer drop_chance;

    public Toy() {
    }

    public Toy(Integer id, String name, Integer drop_chance) {
        this.id = id;
        this.name = name;
        this.drop_chance = drop_chance;
    }

    @Override
    public int compareTo(Toy o) {
        return 0;
    }
}
