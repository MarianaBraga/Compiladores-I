import org.antlr.v4.runtime.*; // class ANTLRInputStream , Token

public class Numbers {
    public static void main(String[] args) {
        NumbersLexer lexer;
        Token tk;
        
        System.out.println("INICIO");

        try {
            lexer = new NumbersLexer(new ANTLRInputStream( System.in ));
        } catch (Exception e) {
            System.out.println("Erro:" + e);
            System.exit(1);
            return;
        }


        do {
            tk = lexer.nextToken();
            switch(tk.getType()) {
                case NumbersLexer.EXPRESSAO:
                	System.out.println("Reconheci "+tk.getText());
                	break;
                default:
                	System.out.println("Expresso nao reconhecida");
                	break;
                
            }
        } while (tk != null && tk.getType() != Token.EOF);

    }
}
