public static void main (String [] args) {
    String s = "[" + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test3\"}," + " {\"lon\": 0.002, \"lat\": 0.005, \"desc\": \"test4\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test5\"}," + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test2\"}]";
    Gson gson = new Gson ();
    Location [] al = gson.fromJson (s, Location [].class);
    List < Location > tl = Arrays.asList (al);
    Collections.sort (tl);
    List < Location > fl = new ArrayList < Location > ();
    Location current = null;
    for (Iterator < Location > it = tl.iterator ();
    it.hasNext ();) {
        current = current == null ? it.next () : current;
        Location ltmp = null;
        while (it.hasNext () && (ltmp = it.next ()).equals (current)) current.desc = current.desc + "," + ltmp.desc;
        fl.add (current);
        current = ltmp;
    }
    System.out.println (gson.toJson (fl));
}


public static void main (String [] args) {
    String jsonString = "[" + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test3\"}," + " {\"lon\": 0.002, \"lat\": 0.005, \"desc\": \"test4\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test5\"}," + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test2\"}]";
    Gson gson = new Gson();
    Location [] al = gson.fromJson (jsonString, Location[].class);
    List < Location > tl = Arrays.asList(al);
    Collections.sort(tl);
    List < Location > fl = new ArrayList < Location > ();
    Location current = null;
    while (!tl.isEmpty ()) {
        current = current == null ? tl.remove (0) : current;
        Iterator < Location > itr = tl.iterator ();
        while (itr.hasNext ()) {
            Location ltmp = itr.next ();
            if (ltmp.equals(current)) {
                current.desc = current.desc + "," + ltmp.desc;
                itr.remove ();
            }
        }
        fl.add (current);
        current = null;
    }
    System.out.println (gson.toJson (fl));
}


