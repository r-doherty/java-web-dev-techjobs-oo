package org.launchcode.techjobs_oo;

public class PositionType extends JobField {

    public PositionType() {
        id = nextId;
        nextId++;
        this.value = "Data not available";
    }

    public PositionType(String value) {
        super(value);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id;
//    }

}
