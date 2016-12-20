package me.fahadalrabbani.calcengine;

import java.util.DoubleSummaryStatistics;

/**
 * Created by achernar on 20/12/2016.
 */
public class DynamicHelper {
    private MathProcessing[] handlers;
    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }
    public  String process(String statements){
        String[] parts = statements.split(MathProcessing.SEPERATOR);
        String keyword = parts[0];
        MathProcessing thisHandler = null;

        for(MathProcessing handler:handlers) {
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                thisHandler = handler;
                break;
            }
        }

        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        double result = thisHandler.doCalculations(leftVal,rightVal);

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(" ");
        sb.append(thisHandler.getSymbol());
        sb.append(" ");
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
