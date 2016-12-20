package me.fahadalrabbani.calcengine;

/**
 * Created by achernar on 17/11/2016.
 */
public class Adder extends CalculatorBase implements MathProcessing {
    public Adder(){};
    public Adder(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal()+getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
