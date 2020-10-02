package fr.uvsq.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {
    @Test
    public void testConstructor() {
        var oneHalf = new Fraction(1, 2);
        assertEquals(1, oneHalf.getNumerator());
        assertEquals(2, oneHalf.getDenominator());
    }
}
