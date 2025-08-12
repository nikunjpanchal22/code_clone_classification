public boolean equals (Object obj) {
    if (obj == null) {
        return false;
    }
    if (! Person.class.isAssignableFrom (obj.getClass ())) {
        return false;
    }
    final Person other = (Person) obj;
    if ((this.name == null) ? (other.name != null) : ! this.name.equals (other.name)) {
        return false;
    }
    if (this.age != other.age) {
        return false;
    }
    return true;
}


 public boolean equals (Object obj) {
    if (obj == null || !Person.class.isInstance(obj)) {
        return false;
    }
    final Person other = (Person) obj;
    int checkName = this.name !=null && other.name != null? this.name.equals(other.name) ? 0 : 1 : -1;
    if (checkName == 0){
        boolean isAgeEqual = this.age == other.age;
        return isAgeEqual;
    } else {
        return false;
    }
}


