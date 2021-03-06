package me.fahadalrabbani.calcengine;

/**
 * Created by achernar on 17/11/2016.
 */
public abstract class CalculatorBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public CalculatorBase(){}
    public CalculatorBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}
