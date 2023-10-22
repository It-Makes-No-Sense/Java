package OOP_Homework_1.src;

public class Account {
    private int balanse = 0;

    public void put(int value){
        balanse += value;
    }

    public void take(int value){
        balanse -= value;
    }

    public int getAmount(){
        return balanse;
    }
}
