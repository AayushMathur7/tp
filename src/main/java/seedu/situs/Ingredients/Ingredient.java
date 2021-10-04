package seedu.situs.Ingredients;

//import java.time.LocalDate;

import java.util.Locale;

/**
 * Represents an Ingredients
 */
public class Ingredient {
    protected String name;
    protected Double amount;
    protected String units;
    protected String expiry; //For v1.0, the expiry date will be stored as a string

    public Ingredient(String name, double amount, String units, String expiry) {
        this.name = name;
        this.amount = amount;
        this.units = units;
        this.expiry = expiry;
    }

    public String getName() {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public Double getAmount() {
        return amount;
    }

    public String getUnits() {
        return units;
    }

    public String getExpiry() {
        return expiry;
    }

    @Override
    public String toString() {
        return getName() + "| Amount Left: " + getAmount() + getUnits() + "| Expiry Date: " + getExpiry();
    }
}
