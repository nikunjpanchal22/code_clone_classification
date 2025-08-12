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



public boolean equals(Object other) {
    if(this == other) return true;
    if(other != null && other instanceof People) {
        People otherPeople = (People) other;
        return this.name.equals(otherPeople.name) && this.age == otherPeople.age;
    }
    return false;
}


