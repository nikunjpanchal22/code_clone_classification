int main (int argc, char const *argv []) {
    VectorPeople vp;
    Person timn;
    Person batman;
    Person bond;
    Person superman;
    init (& vp);
    timn.first_name = "Timn";
    timn.last_name = "Timothy";
    timn.age = 38;
    add (& vp, & timn);
    batman.first_name = "Batn";
    batman.last_name = "Man";
    batman.age = 42;
    add (& vp, & batman);
    bond.first_name = "James";
    bond.last_name = "Bond";
    bond.age = 45;
    add (& vp, & bond);
    superman.first_name = "Super";
    superman.last_name = "Man";
    superman.age = 45;
    add (& vp, & superman);
    int i = 0;
    for (; i < vp.num; ++i) {
        printf ("Person: %s, %s.\n", vp.people [i].last_name, vp.people [i].first_name);
    }
    clear (& vp);
    return 0;
}


 int main (int argc, char const *argv []) {
    VectorPeople vp;
    init(&vp);
    Person timn;
    timn.first_name = "Timn";
    timn.last_name = "Timothy";
    timn.age = 38;
    add(&vp, &timn);
    Person batman;
    batman.first_name = "Batn";
    batman.last_name = "Man";
    batman.age = 42;
    add(&vp, &batman);
    Person bond;
    bond.first_name = "James";
    bond.last_name = "Bond";
    bond.age = 45;
    add(&vp, &bond);
    Person superman;
    superman.first_name = "Super";
    superman.last_name = "Man";
    superman.age = 45;
    add(&vp, &superman);
    int i;
    for(i=0; i<vp.num; i++){
        printf("Person: %s, %s.\n", vp.people[i].last_name, vp.people[i].first_name);
    }
    clear(&vp);
    return 0;
}
