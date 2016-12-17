package me.fahadalrabbani.calcengine;

/**
 * Created by achernar on 17/11/2016.
 */
public class Subtracter extends CalculatorBase {
    public Subtracter(){};
    public Subtracter(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal()-getRightVal();
        setResult(value);
    }
}
