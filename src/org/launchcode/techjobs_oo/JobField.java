package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
        this.value = "Data not available";
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    public String toString() {
        return value;
    }

    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() { return id; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}
