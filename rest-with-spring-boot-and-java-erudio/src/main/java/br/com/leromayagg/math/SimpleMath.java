package br.com.leromayagg.math;

import br.com.leromayagg.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public Double sum( Double numberOne, Double numberTwo)  {

        return numberOne+numberTwo;
    }
    public Double subtration( Double numberOne, Double numberTwo)  {

        return numberOne-numberTwo;
    }
    public Double multiplication( Double numberOne, Double numberTwo)  {

        return numberOne*numberTwo;
    }
    public Double division( Double numberOne, Double numberTwo)  {

        return numberOne/numberTwo;
    }
    public Double mean( Double numberOne, Double numberTwo)  {

        return (numberOne+numberTwo) /2 ;
    }
    public Double squareRoot( Double numberOne)  {

        return Math.sqrt(numberOne);
    }
}
