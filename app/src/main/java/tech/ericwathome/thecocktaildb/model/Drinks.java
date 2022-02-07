package tech.ericwathome.thecocktaildb.model;

import java.util.List;
import java.util.Objects;

public class Drinks {
    private List<Drink> drinks;

    public Drinks() {
    }

    public Drinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drinks)) return false;
        Drinks drinks1 = (Drinks) o;
        return Objects.equals(getDrinks(), drinks1.getDrinks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDrinks());
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinks=" + drinks +
                '}';
    }
}
