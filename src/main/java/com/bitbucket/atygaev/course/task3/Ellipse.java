package com.bitbucket.atygaev.course.task3;

import java.util.Objects;

/**
 * Ellipse with the given horizontal radius and vertical radius.
 */
public class Ellipse {
    private double horizontalRadius;
    private double verticalRadius;

    /**
     * TODO: Implement the method.
     *
     * @return horizontal radius of the ellipse.
     */
    public Ellipse(double horizontalRadius, double verticalRadius) {
        if (horizontalRadius < 0) {
            throw new IllegalArgumentException("Horizontal radius is negative but should be positive.");
        } else if (horizontalRadius == 0) {
            throw new IllegalArgumentException("Horizontal radius is zero but should be positive.");
        }
        if (verticalRadius < 0) {
            throw new IllegalArgumentException("Vertical radius is negative but should be positive.");
        } else if (verticalRadius == 0) {
            throw new IllegalArgumentException("Vertical radius is zero but should be positive.");
        }
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;

    }

    public double getHorizontalRadius() {
        return horizontalRadius;
    }


    /**
     * TODO: Implement the method.
     *
     * @return vertical radius of the ellipse.
     */
    public double getVerticalRadius() {
        return verticalRadius;
    }

    /**
     * TODO: Implement the method.
     * <p>
     * <p>
     * Calculates and returns area of the ellipse.
     * </p>
     * <p>
     * Math formula is <b>Math.PI * Rh * Rv</b> where <b>Rh</b> is horizontal radius of the given ellipse,
     * <b>Rv</b> is vertical radius of the given ellipse.
     * </p>
     *
     * @return area of the ellipse.
     */
    public double getArea() {
        return Math.PI * getHorizontalRadius() * getVerticalRadius();
    }

    /**
     * Calculates and returns hash code by using horizontal radius and vertical radius of the ellipse.
     *
     * @return hashcode of horizontal radius and vertical radius.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getHorizontalRadius(), getVerticalRadius());
    }

    /**
     * Two ellipses is equal when and only when they have the same horizontal radius and vertical radius.
     *
     * @return true when passed object is equal to the ellipse. Otherwise, false.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }

        Ellipse ellipse = (Ellipse) object;

        return Objects.equals(getHorizontalRadius(), ellipse.getHorizontalRadius())
                && Objects.equals(getVerticalRadius(), ellipse.getVerticalRadius());
    }

    /**
     * Human readable representation of the ellipse.
     *
     * @return class name and horizontal radius and vertical radius.
     */
    @Override
    public String toString() {
        return String.format("Ellipse{horizontalRadius=%.2f, verticalRadius=%.2f}", getHorizontalRadius(), getVerticalRadius());
    }
}