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
    if (other == null) return false;
    if (getClass() != other.getClass()) return false;
    final People otherPeople = (People) other;
    return Objects.equals(this.age, otherPeople.age) && Objects.equals(this.name, otherPeople.name);
}


