package org.picokernel.rating.resource.models;

import java.util.Objects;

public class Rating {
    private int rating;

    public Rating() {
        rating = -1;
    }

    public Rating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating1 = (Rating) o;
        return getRating() == rating1.getRating();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRating());
    }
}
