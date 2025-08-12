public static void main (String [] args) throws IOException {
    Path source = Paths.get ("/path/to/source/dir");
    Path destination = Paths.get ("/path/to/dest/dir");
    List < Path > sources = Files.walk (source).collect (toList ());
    List < Path > destinations = sources.stream ().map (source :: relativize).map (destination :: resolve).collect (toList ());
    for (int i = 0;
    i < sources.size (); i ++) {
        Files.copy (sources.get (i), destinations.get (i));
    }
}


public static void main (String [] args) throws IOException {
    Path src = Paths.get("/path/to/source/dir");
    Path dest = Paths.get("/path/to/dest/dir");
    List < Path > files = Files.walk (src).collect (toList ());
    List < Path > dests = files.stream ().map (src :: relativize).map (dest :: resolve).collect (toList ());
    for (int i = 0;
    i < files.size (); i ++) {
        Files.copy (files.get (i), dests.get (i));
    }
}
