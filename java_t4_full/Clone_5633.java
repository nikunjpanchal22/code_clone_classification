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
    if(other == null || this.getClass() != other.getClass()){
        return false;
    }
    People that = (People) other;
    return (this.age == that.age && this.name.equals(that.name));
}


