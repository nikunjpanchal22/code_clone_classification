public static void main (String [] args) {
    int [] constraints = {2, 1, 0, 1};
    List < boolean [] > items = new ArrayList < boolean [] > ();
    boolean [] i1 = {true, false, true, false};
    boolean [] i2 = {true, false, false, false};
    boolean [] i3 = {false, true, false, true};
    boolean [] i4 = {false, false, false, true};
    items.add (i1);
    items.add (i2);
    items.add (i3);
    items.add (i4);
    backtrack (constraints, items);
}


 public static void main (String [] args) {
    int [] constraints = {2, 1, 1, 0};
    List < boolean [] > items = new ArrayList < boolean [] > ();
    boolean [] i1 = {false, false, false, true};
    boolean [] i2 = {true, false, true, false};
    boolean [] i3 = {false, true, true, false};
    boolean [] i4 = {true, true, false, false};
    items.add (i1);
    items.add (i2);
    items.add (i3);
    items.add (i4);
    backtrack (constraints, items);
}


