package OOP_Homework6;

import java.util.UUID;

public class Document {
    private final UUID id;
    private final String number;

    public Document(String number) {
        this.id = UUID.randomUUID();
        this.number = number;
    }

    public String getData() {
        return toString();
    }


    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}