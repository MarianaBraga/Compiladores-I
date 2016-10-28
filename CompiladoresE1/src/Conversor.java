import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Conversor {
    
    public static float converterHexa(String hexa){
        float value = Float.parseFloat(hexa.substring(2, (hexa.length()-1)));
        return value;
    }
    
    public static float converterReal(String real){
        float value = Float.parseFloat(real);
        return value;
    }
    
    private static float turnToBinary(String binary){
        int value=0;
        int pot = 1;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='1'){
                value+= pot;
            }
            pot*=2;
        }
        
        return value;
    }
    
    public static float converterBinario(String binario){
        float value=0;
        value = turnToBinary(binario.substring(0,binario.length()-1));
        return value;
    }
}
