/**
 * 
 */
package com.uangteman.demojenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.demojenkins.service.CalculationService;

/**
 * @author fanjavaid
 *
 */
@RestController
@RequestMapping("/calculation")
public class CalculationController {
	
	@Autowired
	private CalculationService calculationService;
	
	@RequestMapping(value="/add/{number1}/{number2}")
	public int add(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
		return calculationService.add(number1, number2);
	}
	
	@RequestMapping(value="/multiply/{number1}/{number2}")
	public int multiply(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
		return calculationService.multiply(number1, number2);
	}
	
	@RequestMapping(value="/substract/{number1}/{number2}")
	public int substract(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {
		return calculationService.substract(number1, number2);
	}
	
	@RequestMapping(value="/divide/{number1}/{number2}")
	public double divide(@PathVariable("number1") double number1, @PathVariable("number2") double number2) {
		return calculationService.divide(number1, number2);
	}
}
