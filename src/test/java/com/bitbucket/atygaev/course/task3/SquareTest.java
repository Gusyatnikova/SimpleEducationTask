package com.bitbucket.atygaev.course.task3;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SquareTest {

    private static final double COMPARING_WITH_HIGH_PRECISION = 10e-10;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private Square square;

    private Random random;

    @Before
    public void setUp() {
        random = new Random();

        when(square.getArea()).thenCallRealMethod();
    }

    @Test
    public void constructorShouldThrowExceptionWhenLengthIsNegative() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Length is negative but should be positive.");

        // TODO: Uncomment the line when constructor is available
         new Square(-generateLength());
    }

    @Test
    public void constructorShouldThrowExceptionWhenLengthIsZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Length is zero but should be positive.");

        // TODO: Uncomment the line when constructor is available
         new Square(0);
    }

    @Test
    public void shouldCalculateArea() {
        double length = random.nextInt(100) * random.nextDouble();

        // given: square with a certain length of side
        when(square.getLength()).thenReturn(length);

        // when: area of the square is calculated
        assertEquals(length * length, square.getArea(), COMPARING_WITH_HIGH_PRECISION);

        // then: length is used for area calculating
        verify(square).getLength();
    }

    private double generateLength() {
        return random.nextDouble() * random.nextInt(100);
    }
}