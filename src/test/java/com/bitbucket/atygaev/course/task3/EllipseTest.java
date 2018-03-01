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
public class EllipseTest {

    private static final double COMPARING_WITH_HIGH_PRECISION = 10e-10;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private Ellipse ellipse;

    private Random random;

    @Before
    public void setUp() {
        random = new Random();

        when(ellipse.getArea()).thenCallRealMethod();
    }

    @Test
    public void constructorShouldThrowExceptionWhenHorizontalRadiusIsNegative() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Horizontal radius is negative but should be positive.");

        // TODO: Uncomment the line when constructor is available
        new Ellipse(-generateRadius(), generateRadius());
    }

    @Test
    public void constructorShouldThrowExceptionWhenHorizontalRadiusIsZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Horizontal radius is zero but should be positive.");

        // TODO: Uncomment the line when constructor is available
        new Ellipse(0, generateRadius());
    }

    @Test
    public void constructorShouldThrowExceptionWhenVerticalRadiusIsNegative() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Vertical radius is negative but should be positive.");

        // TODO: Uncomment the line when constructor is available
        new Ellipse(generateRadius(), -generateRadius());
    }

    @Test
    public void constructorShouldThrowExceptionWhenVerticalRadiusIsZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Vertical radius is zero but should be positive.");

        // TODO: Uncomment the line when constructor is available
        new Ellipse(generateRadius(), 0);
    }

    @Test
    public void shouldCalculateArea() {
        double horizontalRadius = generateRadius();

        double verticalRadius = generateRadius();

        // given: ellipse with a certain horizontal radius
        when(ellipse.getHorizontalRadius()).thenReturn(horizontalRadius);

        // given: ellipse with a certain vertical radius
        when(ellipse.getVerticalRadius()).thenReturn(verticalRadius);

        // when: area of the ellipse is calculated
        assertEquals(Math.PI * horizontalRadius * verticalRadius, ellipse.getArea(), COMPARING_WITH_HIGH_PRECISION);

        // then: horizontal radius is used for area calculating
        verify(ellipse).getHorizontalRadius();

        //  and: vertical radius is used for area calculating
        verify(ellipse).getVerticalRadius();
    }

    private double generateRadius() {
        return random.nextDouble() * random.nextInt(100);
    }
}