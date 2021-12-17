package CommandEx;

import javax.management.DynamicMBean;

public class File {
    String name;
    String owner;

    public File(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void createFile() {
        System.out.println("create");
    }

    public void deleteFile() {
        System.out.println("delete");
    }

    public void modifyFile() {
        System.out.println("modify");
    }
}
