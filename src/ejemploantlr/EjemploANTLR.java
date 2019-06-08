/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploantlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author adgao
 */
public class EjemploANTLR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharStream in = CharStreams.fromString("2 *4+3;");
        gramaticaLexer lexer = new gramaticaLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramaticaParser parser = new gramaticaParser(tokens);
        parser.exp();
    }
    
}
