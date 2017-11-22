package com.javacodegeeks.examples.junitmavenexample;

public class Calculator implements ICalculator {

	@Override
	public int sum(int a, int b) {
		    // ...
			Object einObjekt = new Object();
			// ...
			if (einObjekt == null)
				System.out.println("Hash-Code= " + einObjekt.hashCode());
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	@Override
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
	//Bug für Findbugs
	public void bug(){

	}
}
