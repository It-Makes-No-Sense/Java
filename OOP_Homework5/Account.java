package OOP_Homework5;

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
