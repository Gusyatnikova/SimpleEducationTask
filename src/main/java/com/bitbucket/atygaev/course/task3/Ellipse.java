package com.bitbucket.atygaev.course.task3;

import java.util.Objects;

/**
 * Ellipse with the given horizontal radius and vertical radius.
 */
public class Ellipse {

    /**
     * TODO: Implement the method.
     *
     * @return horizontal radius of the ellipse.
     */
    public double getHorizontalRadius() {
        throw new UnsupportedOperationException();
    }


    /**
     * TODO: Implement the method.
     *
     * @return vertical radius of the ellipse.
     */
    public double getVerticalRadius() {
        throw new UnsupportedOperationException();
    }

    /**
     * TODO: Implement the method.
     *
     * <p>
     * Calculates and returns area of the ellipse.
     * </p>
     * <p>
     * Math formula is <b>Math.PI * Rh * Rv</b> where <b>Rh</b> is horizontal radius of the given ellipse,
     * <b>Rv</b> is vertical radius of the given ellipse.
     *</p>
     * @return area of the ellipse.
     */
    public double getArea() {
        throw new UnsupportedOperationException();
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
        if (object == this) { return true; }
        if ((object == null) || (getClass() != object.getClass())) { return false; }

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