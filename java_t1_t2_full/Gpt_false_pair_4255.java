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
    Path sourceDir = Paths.get ("/path/to/source/dir");
    Path destDir = Paths.get ("/path/to/dest/dir");
    List < Path > sourcePaths = Files.walk (sourceDir).collect (toList ());
    List < Path > destPaths = sourcePaths.stream ().map (sourceDir :: relativize).map (destDir :: resolve).collect (toList ());
    for (int i = 0;
    i < sourcePaths.size (); i ++) {
        Files.copy (sourcePaths.get (i), destPaths.get (i));
    }
}
