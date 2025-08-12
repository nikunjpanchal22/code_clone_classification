public static void main (String [] args) {
    List < Object > lc = Arrays.asList (new Object [] {'A', 'B', 'C', 'D'});
    List < Object > lC = Arrays.asList (new Object [] {'a', 'b', 'c'});
    List < Object > li = Arrays.asList (new Object [] {1, 2, 3, 4});
    List < List < Object > > llo = new ArrayList < List < Object > > ();
    llo.add (lc);
    llo.add (lC);
    llo.add (li);
    CartesianIterable < Object > ci = new CartesianIterable < Object > (llo);
    for (List < Object > lo : ci) show (lo);
}



public static void main (String [] args) {
    List < Object > list1 = List.of('A', 'B', 'C', 'D');
    List < Object > list2 = List.of('a', 'b', 'c', 'd');
    List < Object > list3 = List.of(1, 2, 3, 4);
    CartesianIterable<Object> cartesianIterable = new CartesianIterable<>(
            List.of(list1, list2, list3)
    );
    cartesianIterable.forEach(System.out::println);
}

