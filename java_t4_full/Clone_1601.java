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
      if (other == null || getClass() != other.getClass()) {
          return false;
      }
      People otherPeople = (People) other;
      if (this == other) { 
          return true; 
      }
      return name.equals (otherPeople.name) && age == otherPeople.age;
}


