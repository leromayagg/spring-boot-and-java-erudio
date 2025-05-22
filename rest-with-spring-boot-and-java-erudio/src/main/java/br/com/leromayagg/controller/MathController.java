package br.com.leromayagg.controller;

import br.com.leromayagg.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {


    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo")String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo")String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo")String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable("numberOne") String numberOne,
                       @PathVariable("numberTwo")String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @RequestMapping("/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable("numberOne") String numberOne,
                       @PathVariable("numberTwo")String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }
    @RequestMapping("/raiz/{numberOne}/{numberTwo}")
    public Double raiz(@PathVariable("numberOne") String numberOne,
                       @PathVariable("numberTwo")String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        return Math.sqrt(convertToDouble(numberOne));
    }



    private Double convertToDouble(String strnumber)throws IllegalArgumentException{
        if(strnumber == null || strnumber.isEmpty())
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        String number = strnumber.replace(",", ".");//trocar a virgula por ponto
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strnumber) {
        if(strnumber == null || strnumber.isEmpty()) return false;
        String number = strnumber.replace(",", ".");//trocar a virgula por ponto
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    };


}
