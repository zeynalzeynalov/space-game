package com.spaceship.app;

import java.util.Objects;

public abstract class Coordinate<T> implements ISpaceCoordinate<T> {

    private final T x;
    private final T y;

    public Coordinate(T coordinateX, T coordinateY) {

        this.x = coordinateX;
        this.y = coordinateY;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if (!Coordinate.class.isAssignableFrom(obj.getClass()))
            return false;

        final Coordinate other = (Coordinate) obj;

        if (!Objects.equals(this.x, other.x))
            return false;

        return Objects.equals(this.y, other.y);
    }

    @Override
    public int hashCode() {
        int prime = 31;

        int result = 1;

        result = prime * result + (this.x == null ? 0 : this.x.hashCode());
        result = prime * result + (this.y == null ? 0 : this.y.hashCode());

        return result;
    }

    @Override
    public T getX() {

        return x;
    }

    @Override
    public T getY() {

        return y;
    }

}
