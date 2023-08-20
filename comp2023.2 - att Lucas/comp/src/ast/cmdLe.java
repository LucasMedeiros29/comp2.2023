package comp.src.ast;

import comp.src.datastructures.GramaticaVariable;
import comp.src.datastructures.GramaticaVariable;

public class cmdLe extends AbstractCommand {

    private String id;
    private GramaticaVariable var;

    public cmdLe(String id, GramaticaVariable var) {
        this.id = id;
        this.var = var;
    }

    @Override
    public String generateJavaCode() {
        String scannerMethod;
        if (var.getType() == GramaticaVariable.NUMBER){
            scannerMethod = "nextDouble()";
        } else {
            scannerMethod = "nextLine()";
        }
        return id + " = _keyScanner." + scannerMethod + ";";
    }

    @Override
    public String toString() {
        return "cmdLe{" +
                "id='" + id + '\'' +
                '}';
    }
}
