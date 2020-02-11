package org.launchcode.techjobs_oo;

public class CoreCompetency extends JobField {

    public CoreCompetency() {
        id = nextId;
        nextId++;
        this.value = "Data not available";
    }

    public CoreCompetency(String value) {
        super(value);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CoreCompetency)) return false;
//        CoreCompetency that = (CoreCompetency) o;
//        return id == that.id;
//    }
}
