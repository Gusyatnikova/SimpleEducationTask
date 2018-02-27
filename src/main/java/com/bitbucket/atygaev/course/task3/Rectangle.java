package com.bitbucket.atygaev.course.task3;

import java.util.Objects;

/**
 * Rectangle with the given height and width.
 */
public class Rectangle {

    /**
     * TODO: Implement the method.
     *
     * @return height of the rectangle.
     */
    public double getHeight() {
        throw new UnsupportedOperationException();
    }


    /**
     * TODO: Implement the method.
     *
     * @return width of the rectangle.
     */
    public double getWidth() {
        throw new UnsupportedOperationException();
    }

    /**
     * TODO: Implement the method.
     *
     * <p>
     * Calculates and returns area of the rectangle.
     * </p>
     * <p>
     * Math formula is <b>H * W</b> where <b>H</b> is height of the given rectangle,
     * <b>W</b> is width of the given rectangle.
     *</p>
     * @return area of the rectangle.
     */
    public double getArea() {
        throw new UnsupportedOperationException();
    }

    /**
     * Calculates and returns hash code by using height and width of the rectangle.
     *
     * @return hashcode of height and width.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }

    /**
     * Two rectangles is equal when and only when they have the same height and width.
     *
     * @return true when passed object is equal to the rectangle. Otherwise, false.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) { return true; }
        if ((object == null) || (getClass() != object.getClass())) { return false; }

        Rectangle rectangle = (Rectangle) object;

        return Objects.equals(getHeight(), rectangle.getHeight())
                && Objects.equals(getWidth(), rectangle.getWidth());
    }

    /**
     * Human readable representation of the rectangle.
     *
     * @return class name and height and width.
     */
    @Override
    public String toString() {
        return String.format("Rectangle{height=%.2f, width=%.2f}", getHeight(), getWidth());
    }
}