package CommandEx;

public class CreateCommand implements Command {
    @Override
    public void execute(File file) {
        file.createFile();
    }
}
