package at.edu.c02.calculator.logic.operations;

import java.math.BigInteger;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;

public class Mod implements MathOperation{

	@Override
	public double calculate(double a, double b) throws CalculatorException {
		BigInteger a1 = BigInteger.valueOf((long) a), b1 = BigInteger.valueOf((long) b);
		BigInteger c = a1.mod(b1);
		return c.doubleValue();
	}

}
