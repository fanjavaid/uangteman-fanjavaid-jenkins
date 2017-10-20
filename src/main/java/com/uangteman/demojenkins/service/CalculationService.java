/**
 * 
 */
package com.uangteman.demojenkins.service;

import org.springframework.stereotype.Service;

/**
 * @author fanjavaid
 *
 */
@Service("calculationService")
public class CalculationService {
	public int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public int multiply(int number1, int number2) {
		return number1 * number2;
	}
	
	public int substract(int number1, int number2) {
		return number1 - number2;
	}
	
	public double divide(double number1, double number2) {
		return number1 / number2;
	}
	
	public int modulo(int number1, int number2) {
		return number1 % number2;
	}
}
