package tech.ericwathome.thecocktaildb.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Drink {
    @SerializedName("idDrink")
    private long id;
    @SerializedName("strDrink")
    private String drink;
    @SerializedName("strCategory")
    private String category;
    @SerializedName("strGlass")
    private String glass;

    public Drink() {
    }

    public Drink(long id, String drink, String category, String glass) {
        this.id = id;
        this.drink = drink;
        this.category = category;
        this.glass = glass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        Drink drink1 = (Drink) o;
        return getId() == drink1.getId() && Objects.equals(getDrink(), drink1.getDrink()) && Objects.equals(getCategory(), drink1.getCategory()) && Objects.equals(getGlass(), drink1.getGlass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDrink(), getCategory(), getGlass());
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", drink='" + drink + '\'' +
                ", category='" + category + '\'' +
                ", glass='" + glass + '\'' +
                '}';
    }
}
