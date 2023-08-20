package comp.src.ast;

import java.util.ArrayList;

public class cmdIf extends AbstractCommand {

    private String condition;
    private ArrayList<AbstractCommand> TipoLista;
    private ArrayList<AbstractCommand> NaoLista;

    public cmdIf(String condition, ArrayList<AbstractCommand> TipoLista, ArrayList<AbstractCommand> NaoLista) {
        this.condition = condition;
        this.TipoLista = TipoLista;
        this.NaoLista = NaoLista;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("if (");
        stringBuilder.append(condition);
        stringBuilder.append(") {\n");
        TipoLista.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
        stringBuilder.append("}\n");
        if(!NaoLista.isEmpty()) {
            stringBuilder.append("else {\n");
            NaoLista.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
            stringBuilder.append("}\n");
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "cmdIf{" +
                "condition='" + condition + '\'' +
                ", TipoLista=" + TipoLista +
                ", NaoLista=" + NaoLista +
                '}';
    }
}
