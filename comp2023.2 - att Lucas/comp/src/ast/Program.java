package comp.src.ast;

import comp.src.datastructures.GramaticaSymbol;
import comp.src.datastructures.GramaticaSymbolTable;
import comp.src.datastructures.GramaticaSymbolTable;
import comp.src.datastructures.GramaticaSymbol;
import comp.src.datastructures.GramaticaSymbolTable;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Program {
    private GramaticaSymbolTable vartable;
    private ArrayList<AbstractCommand> commands;
    private String programName;

    public void generateTarget(){
        String className = "Output";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("import java.util.Scanner;\n");
        stringBuilder.append("public class " + className + " {\n");
        stringBuilder.append("public static void main(String args[]){\n");
        stringBuilder.append("Scanner _keyScanner = new Scanner(System.in);\n");
        vartable.getAll().forEach(GramaticaSymbol -> stringBuilder.append(GramaticaSymbol.generateJavaCode() + "\n"));
        commands.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
        stringBuilder.append("\n");
        stringBuilder.append("}\n");
        stringBuilder.append("}\n");

        try {
            FileWriter fileWriter = new FileWriter(new File(className + ".java"));
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public GramaticaSymbolTable getVartable() {
        return vartable;
    }

    public void setVartable(GramaticaSymbolTable vartable) {
        this.vartable = vartable;
    }

    public ArrayList<AbstractCommand> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<AbstractCommand> commands) {
        this.commands = commands;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
