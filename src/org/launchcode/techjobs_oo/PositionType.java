package org.launchcode.techjobs_oo;

public class PositionType extends JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType (String value) {
        super(value);
    }
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    public String toString() {
//        return value;
//    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PositionType)) return false;
        if (!super.equals(object)) return false;
        PositionType that = (PositionType) object;
        return getId() == that.getId() && getValue().equals(that.getValue());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getId(), getValue());
    }

    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
