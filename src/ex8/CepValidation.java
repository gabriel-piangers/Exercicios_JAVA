package ex8;


import java.util.ArrayList;
import java.util.Arrays;

public class CepValidation {
    public static boolean validarCEP(String cep) {
        if(cep.length() != 9) return false;

        ArrayList<Character> accept = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-'));
        for (char c : cep.toCharArray()) {
            if (!accept.contains(c)) return false;
        }
        return true;
    }
}
