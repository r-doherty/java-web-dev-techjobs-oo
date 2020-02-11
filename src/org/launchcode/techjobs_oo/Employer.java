package org.launchcode.techjobs_oo;

public class Employer extends JobField {

    public Employer() {
        id = nextId;
        nextId++;
        this.value = "Data not available";
    }

    public Employer(String value) {
        super(value);
    }

//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }

}
