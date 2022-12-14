package project;

import java.util.Scanner;

/**
 *
 * @author Tamerlan Aghayev
 */
public class MultiplicationOperation extends MathOperation{
    
    public MultiplicationOperation(Scanner input)
    {
        super(input);
        setOperation('x');
    }
    
    
    public MultiplicationOperation(int num1,int num2)
    {
        super(num1,num2);
        setOperation('x');
    }
    
    public String toString()
    {
        return(String.format("%d * %d", this.getNum1(),this.getNum2()));
    }

    
    
    public double getResult()
    {
        return(this.getNum1() * this.getNum2());
    }
}
