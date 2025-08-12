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


 public boolean equals (Object other) {boolean result = false; 
   if(other != null) { 
      People otherPeople = (People) other;
      if(getClass() == other.getClass()) {
         result = name.equals(otherPeople.name) && age == otherPeople.age; 
      }
   } 
   return result; 
}


