package CommandEx;

public class ModifyCommand implements Command {
    @Override
    public void execute(File file) {
        file.modifyFile();
    }
}
