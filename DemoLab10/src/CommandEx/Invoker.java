package CommandEx;

public class Invoker {
    File file;
    public Invoker() {
        file = new File("myFile", "me");
    }

    public void execute(Command command) {
        command.execute(file);
    }
}
