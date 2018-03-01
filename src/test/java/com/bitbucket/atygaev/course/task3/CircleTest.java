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
public class CircleTest {

    private static final double COMPARING_WITH_HIGH_PRECISION = 10e-10;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private Circle circle;

    private Random random;

    @Before
    public void setUp() {
        random = new Random();

        when(circle.getArea()).thenCallRealMethod();
    }

    @Test
    public void constructorShouldThrowExceptionWhenRadiusIsNegative() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Radius is negative but should be positive.");

        // TODO: Uncomment the line when constructor is available
        new Circle(-generateRadius());
    }

    @Test
    public void constructorShouldThrowExceptionWhenRadiusIsZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Radius is zero but should be positive.");

        // TODO: Uncomment the line when constructor is available
        new Circle(0);
    }

    @Test
    public void shouldCalculateArea() {
        double radius = generateRadius();

        // given: circle with a certain radius
        when(circle.getRadius()).thenReturn(radius);

        // when: area of the circle is calculated
        assertEquals(Math.PI * radius * radius, circle.getArea(), COMPARING_WITH_HIGH_PRECISION);

        // then: radius is used twice for area calculating
        verify(circle).getRadius();
    }

    private double generateRadius() {
        return random.nextDouble() * random.nextInt(100);
    }
}