package comp.src.ast;

public class cmdEscreve extends AbstractCommand {

    private String id;

    public cmdEscreve (String id) {
        this.id = id;
    }

    @Override
    public String generateJavaCode() {
        return "System.out.println(" + id + ");";
    }

    @Override
    public String toString() {
        return "cmdEscreve{" +
                "id='" + id + '\'' +
                '}';
    }
}
