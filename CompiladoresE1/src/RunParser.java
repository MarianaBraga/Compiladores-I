
import org.antlr.v4.runtime.*; // class ANTLRInputStream , Token
import java.io.*;
import javax.swing.JFileChooser; import javax.swing.filechooser.*;
public class RunParser {
    public static void main(String[] args) throws Exception {
        //ou recebe como argumento, depende de como preferir executar
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("text1", "txt"));
        int retval = chooser.showOpenDialog(null);
        if (retval != JFileChooser.APPROVE_OPTION) return;
        try {

            FileInputStream fin = new FileInputStream(chooser.getSelectedFile());
            //File f = new File(args[0]);
            //FileInputStream fin = new FileInputStream(f);
            MMMLLexer lexer = new MMMLLexer(new ANTLRInputStream( fin));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MMMLParser parser = new MMMLParser(tokens);
            parser.funcbody(); // Comecando dessa regra , poderia trocar
            // por .funcbody ou .metaexpr
        } catch (Exception e) {
            // Pikachu!
            System.out.println("Erro:" + e);
            return;
        }
        
    }
}