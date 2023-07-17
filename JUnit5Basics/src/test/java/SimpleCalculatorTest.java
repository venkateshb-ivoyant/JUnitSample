import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualsFour(){
      var calculator = new SimpleCalculator();
      assertEquals(4,calculator.add(2,2));
    }
    @Test
    void fivePlusThreeShouldEqualsEight(){
        var calculator = new SimpleCalculator();
        assertEquals(8,calculator.add(5,3));
    }
    @Test
    void minusfivePlusMinusThreeShouldEqualsEight(){
        var calculator = new SimpleCalculator();
        assertEquals(-8,calculator.add(-5,-3));
    }
    @Test
    void minusfivePlusThreeShouldEqualsMinusTwo(){
        var calculator = new SimpleCalculator();
        assertEquals(-2,calculator.add(-5,3));
    }
    @Test
    public void testSubtraction() {
        var calculator = new SimpleCalculator();
        int result = calculator.subtraction(5, 3);
        assertNotEquals(3, result, "Subtraction test failed");
    }
    @Test
    public void testMultiplication() {
        var calculator = new SimpleCalculator();
        int result = calculator.multiplication(4, 2);
        assertTrue(result > 0, "Multiplication test failed");
    }
    @Test
    public void testDivision() {
        var calculator = new SimpleCalculator();
        double result = calculator.division(10, 2);
        assertFalse(result == 0, "Division test failed");
    }
    @Test
    public void testException() {
        var calculator = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> calculator.division(5, 0),
                "Divide by zero should throw ArithmeticException");
    }
    @Test
    void testAreaofCircle(){
        var cal = new SimpleCalculator();
        assertEquals(314.1592653589793,cal.areaOfCircle(10));
    }

}