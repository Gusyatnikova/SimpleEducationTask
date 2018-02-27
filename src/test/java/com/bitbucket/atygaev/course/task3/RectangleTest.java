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
public class RectangleTest {

    private static final double COMPARING_WITH_HIGH_PRECISION = 10e-10;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private Rectangle rectangle;

    private Random random;

    @Before
    public void setUp() {
        random = new Random();

        when(rectangle.getArea()).thenCallRealMethod();
    }

    @Test
    public void constructorShouldThrowExceptionWhenHeightIsNegative() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Height is negative but should be positive.");

        // TODO: Uncomment the line when constructor is available
        // new Rectangle(-generateLength(), generateLength());
    }

    @Test
    public void constructorShouldThrowExceptionWhenHeightRadiusIsZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Height is zero but should be positive.");

        // TODO: Uncomment the line when constructor is available
        // new Rectangle(0, generateLength());
    }

    @Test
    public void constructorShouldThrowExceptionWhenWidthIsNegative() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Width is negative but should be positive.");

        // TODO: Uncomment the line when constructor is available
        // new Rectangle(generateLength(), -generateLength());
    }

    @Test
    public void constructorShouldThrowExceptionWhenWidthIsZero() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Width is zero but should be positive.");

        // TODO: Uncomment the line when constructor is available
        // new Rectangle(generateLength(), 0);
    }

    @Test
    public void shouldCalculateArea() {
        double height = random.nextInt(100) * random.nextDouble();

        double width = random.nextInt(100) * random.nextDouble();

        // given: rectangle with a certain height
        when(rectangle.getHeight()).thenReturn(height);

        // given: rectangle with a certain width
        when(rectangle.getWidth()).thenReturn(width);

        // when: area of the rectangle is calculated
        assertEquals(height * width, rectangle.getArea(), COMPARING_WITH_HIGH_PRECISION);

        // then: height is used for area calculating
        verify(rectangle).getHeight();

        //  and: width is used for area calculating
        verify(rectangle).getWidth();
    }

    private double generateLength() {
        return random.nextDouble() * random.nextInt(100);
    }
}