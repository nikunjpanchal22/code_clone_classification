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



public boolean equals(Object o){
    if(!(o instanceof Person)) {
        return false;
    }
    if(o == this) {
        return true;
    }
    Person other = (Person) o;
    return other.name.equals(this.name) && other.age == this.age;
}


