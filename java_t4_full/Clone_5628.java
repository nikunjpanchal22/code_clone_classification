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
    if(obj == null || getClass() != obj.getClass()){
        return false;
    }
    Person that = (Person) obj; 
    return age == that.age && name.equals(that.name); 
}

