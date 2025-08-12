public boolean equals (Object other) {
    boolean result;
    if ((other == null) || (getClass () != other.getClass ())) {
        result = false;
    } else {
        People otherPeople = (People) other;
        result = name.equals (otherPeople.name) && age == otherPeople.age;
    }
    return result;
}



public boolean equals (Object other) {
    if (other == null || other.getClass() != this.getClass()) return false;
    if (other == this) return true;
    People that = (People) other;
    return age == that.age && (name == null ? that.name == null : name.equals(that.name));
}


