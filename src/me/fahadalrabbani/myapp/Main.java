package me.fahadalrabbani.myapp;


import me.fahadalrabbani.calcengine.Adder;
import me.fahadalrabbani.calcengine.CalculateHelper;
import me.fahadalrabbani.calcengine.CalculatorBase;
import me.fahadalrabbani.calcengine.Divider;
import me.fahadalrabbani.calcengine.InvalidStatementException;
import me.fahadalrabbani.calcengine.MathEquation;
import me.fahadalrabbani.calcengine.Multiplier;
import me.fahadalrabbani.calcengine.Subtracter;

public class Main {

    public static void main(String[] args) {

        //useMathEquation();
        //useBaseCalculation();

        String[] statements = {
                "add 1.0",//incorrect number of values
                "add xx 25.0",//non-numeric data
                "addX 0.0 0.0",//invalid command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };
        CalculateHelper helper = new CalculateHelper();
        for(String stmt: statements){
            try {
                helper.process(stmt);
                System.out.println(helper);
            }catch (InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause()!=null){
                    System.out.println("Original Exception: "+e.getCause().getMessage());
                }
            }
        }

    }

    static void useMathEquation(){
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        int leftInt = 9;
        double rightDouble = 4.0d;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation();
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Result = " + equationOverload.getResult());
        equationOverload.execute(leftInt, rightInt);
        System.out.println("Result = " + equationOverload.getResult());
        equationOverload.execute((double) leftInt, rightInt);
        System.out.println("Result = " + equationOverload.getResult());
    }

    static void useBaseCalculation(){
        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();
        CalculatorBase[] calculators = {
                new Divider(100.0d,50.d),
                new Adder(25.0d,92.0d),
                new Subtracter(225.0d,17.0d),
                new Multiplier(11.0d,3.0d)
        };

        for (CalculatorBase calculator:calculators){
            calculator.calculate();
            System.out.print("Result = ");
            System.out.println(calculator.getResult());

        }
    }

}
