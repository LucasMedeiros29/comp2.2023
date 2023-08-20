package comp.src.main;

import comp.src.parser.GramaticaLexer;
import comp.src.parser.GramaticaParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class MainClass {
    public static void main(String[] args) {
        try {
        	GramaticaLexer lexer  = new GramaticaLexer(CharStreams.fromFileName("input.txt"));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokenStream);
            parser.program();
            System.out.println("Validado com sucesso");
            parser.generateCode();
        }
        catch (Exception err) {
            System.err.println("Erro: " + err.getMessage());
        }

    }
}

