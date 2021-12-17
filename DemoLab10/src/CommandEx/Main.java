package CommandEx;

public class Main {
    public static void main(String[] args) {
        Invoker i = new Invoker();
        i.execute(new CreateCommand());
        i.execute(new ModifyCommand());
        i.execute(new DeleteCommand());
    }
}
