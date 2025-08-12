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
    Gson gson = new Gson ();
    Location [] al = gson.fromJson (jsonString, Location [].class);
    List < Location > tl = Arrays.asList (al);
    Collections.sort (tl);
    List < Location > fl = new ArrayList < Location > ();
    fl.add (tl.get (0));
    int i = 1;
    while (i < tl.size ()) {
        fl.get (fl.size () - 1).desc = fl.get (fl.size () - 1).desc + "," + tl.get (i).desc;
        if (!tl.get (i).equals (tl.get (i - 1))) {
            fl.add (tl.get (i));
        }
        i++;
    }
    System.out.println (gson.toJson (fl));
}


