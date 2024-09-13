package Animals;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    protected String name;
    protected String birthDate;
    protected List<String> commands;

    public Animals(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", BirthDate: " + birthDate + ", Commands: " + commands;
    }
}
