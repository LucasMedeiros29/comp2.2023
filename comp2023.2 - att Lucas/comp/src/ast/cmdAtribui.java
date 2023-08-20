package comp.src.ast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import comp.src.datastructures.GramaticaSymbol;
import comp.src.datastructures.GramaticaVariable;

public class cmdAtribui extends AbstractCommand {

    private String id;
    private String expression;
    private final String regexIdentifier = "[a-z]([a-z]|[A-Z]|[0-9])*";
    private final String regexNumber = "[0-9]+(\\.[0-9]+)?";
    private final String idOrNumber = regexIdentifier + "|" + regexNumber;
    
    public cmdAtribui(String id, String expression) {
        this.id = id;
        this.expression = expression;
    }

    private String substituiPotencia(String exp) {
        final String regex = "(?<base>"+ idOrNumber +")\\*\\*(?<potencia>"+ idOrNumber +")";
        final String subst = "Math.pow(${base},${potencia})";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(exp);
        final String modifiedExpression = matcher.replaceAll(subst);
        return modifiedExpression;
    }

    private String substituiRaiz(String exp) {
        final String regex = "raiz(?<radicando>[0-9]+(\\.[0-9]+)*)";
        final String subst = "Math.sqrt(${radicando})";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(exp);
        final String modifiedExpression = matcher.replaceAll(subst);
        return modifiedExpression;
    }

    private String substituiLog(String exp) {
        final String regex = "log(?<logaritmando>[0-9]+(\\.[0-9]+)*)";
        final String subst = "Math.log(${logaritmando})";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(exp);
        final String modifiedExpression = matcher.replaceAll(subst);
        return modifiedExpression;
    }


    @Override
    public String generateJavaCode() {
        expression = substituiPotencia(expression);
        expression = substituiRaiz(expression);
        expression = substituiLog(expression);
        return id + " =" + expression + ";";
    }

    @Override
    public String toString() {
        return "cmdAtribui{" +
                "id='" + id + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
