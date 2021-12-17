package CommandEx;

public class DeleteCommand implements Command {
    @Override
    public void execute(File file) {
        file.deleteFile();
    }
}
