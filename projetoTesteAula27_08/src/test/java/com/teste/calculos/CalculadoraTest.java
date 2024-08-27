package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5+5 = 10")
	void testSum() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;

		// Act
		double resultado = calc.sum(valor1, valor2);

		// Assert
		assertEquals(esperado, resultado, "5+5 = não gerou o valor 10");
	}

	@Test
	@DisplayName("Teste 8-7 = 1")
	void testsub() {
		// Arrange
		Calculadora calc = new Calculadora();
		int valor1 = 8;
		int valor2 = 7;
		int esperado = 1;

		// Act
		double resultado = calc.sub(valor1, valor2);

		// Assert
		assertEquals(esperado, resultado, "8-7 = não gerou o valor 1");
	}

	@Test
	@DisplayName("Teste 12*5 = 60")
	void testmult() {
		// Arrange
		Calculadora calc = new Calculadora();
		int valor1 = 12;
		int valor2 = 5;
		int esperado = 60;

		// Act
		int resultado = calc.mult(valor1, valor2);

		// Assert
		assertEquals(esperado, resultado, "12*5 = não gerou o valor 60");
	}

	@Test
	@DisplayName("Teste 12/3 = ")
	void testdiv() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 12;
		double valor2 = 3;
		double esperado = 4;

		// Act
		double resultado = calc.div(valor1, valor2);

		// Assert
		assertEquals(esperado, resultado, "12/3 = não gerou o valor 4");
	}

}
