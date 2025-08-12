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



public boolean equals(Object obj) {
    if(this == obj) {
        return true;
    }
    if(obj == null) {
        return false;
    }
    if(getClass() != obj.getClass()) {
        return false;
    }
    Person other = (Person) obj;
    if(name != null ? !name.equals(other.name) : other.name != null) {
        return false;
    }
    return age == other.age;
}


