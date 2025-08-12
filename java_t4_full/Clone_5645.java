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
    if (other == null) return false;
    if (this == other) return true;
    if (!(other instanceof People)) return false;
    People people = (People) other;
    return age == people.age && (name != null ? name.equals(people.name) : people.name == null);
}

