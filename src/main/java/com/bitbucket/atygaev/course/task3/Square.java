package com.bitbucket.atygaev.course.task3;


import java.util.Objects;

/**
 * Square with the given side length.
 */
public class Square {
    private double length;

    Square(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length is negative but should be positive.");
        } else if (length == 0) {
            throw new IllegalArgumentException("Length is zero but should be positive.");
        }
        this.length = length;
    }

    /**
     * TODO: Implement the method.
     *
     * @return length of the side of the square.
     */
    public double getLength() {
        return this.length;
    }

    /**
     * TODO: Implement the method.
     * <p>
     * <p>
     * Calculates and returns area of the square.
     * </p>
     * <p>
     * Math formula is <b>L * L</b> where <b>L</b> is length of side of the given square.
     * </p>
     *
     * @return area of the square.
     */
    public double getArea() {
        return Math.pow(getLength(), 2);
    }

    /**
     * Calculates and returns hash code by using length of side of the square.
     *
     * @return hashcode of length of side of squre.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getLength());
    }

    /**
     * Two squares is equal when and only when they have the same length of side.
     *
     * @return true when passed object is equal to the square. Otherwise, false.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }

        Square square = (Square) object;

        return Objects.equals(getLength(), square.getLength());
    }

    /**
     * Human readable representation of the square.
     *
     * @return class name and length of side.
     */
    @Override
    public String toString() {
        return String.format("Square{length=%.2f}", getLength());
    }

}