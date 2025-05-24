package br.com.leromayagg.request.converters;

import br.com.leromayagg.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strnumber)throws IllegalArgumentException{
        if(strnumber == null || strnumber.isEmpty())
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        String number = strnumber.replace(",", ".");//trocar a virgula por ponto
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strnumber) {
        if(strnumber == null || strnumber.isEmpty()) return false;
        String number = strnumber.replace(",", ".");//trocar a virgula por ponto
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    };
}
