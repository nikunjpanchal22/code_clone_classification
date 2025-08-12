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


 public boolean equals (Object other) {return other != null && getClass() == other.getClass() && 
       ((People) other).age == this.age && 
       ((People) other).name.equals(this.name); 
}


