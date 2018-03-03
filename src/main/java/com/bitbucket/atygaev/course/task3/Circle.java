package com.bitbucket.atygaev.course.task3;

import java.util.Objects;

/**
 * Circle with the given radius.
 */



public class Circle {
    private double radius;
    /**
     * TODO: Implement the method.
     *
     * @return radius of the circle.
     */
    public Circle(double givenRadius) {
        if(givenRadius < 0){
            throw new IllegalArgumentException("Radius is negative but should be positive.");
        }
        else if(givenRadius == 0) {
            throw new IllegalArgumentException("Radius is zero but should be positive.");
        }
        radius = givenRadius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * TODO: Implement the method.
     *
     * <p>
     * Calculates and returns area of the circle.
     * </p>
     * <p>
     * Math formula is <b>Math.PI * R * R</b> where <b>R</b> is radius of the given circle.
     *</p>
     * @return area of the circle.
     */
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    /**
     * Calculates and returns hash code by using radius of the circle.
     *
     * @return hashcode of radius.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    /**
     * Two circles is equal when and only when they have the same radius.
     *
     * @return true when passed object is equal to the circle. Otherwise, false.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) { return true; }
        if ((object == null) || (getClass() != object.getClass())) { return false; }

        Circle circle = (Circle) object;

        return Objects.equals(getRadius(), circle.getRadius());
    }

    /**
     * Human readable representation of the circle.
     *
     * @return class name and radius.
     */
    @Override
    public String toString() {
        return String.format("Circle{radius=%.2f}", getRadius());
    }
}