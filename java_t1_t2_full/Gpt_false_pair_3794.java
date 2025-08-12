public static void listFilesForFolder (final File folder) {
    for (final File fileEntry : folder.listFiles ()) {
        if (fileEntry.isDirectory ()) {
            listFilesForFolder (fileEntry);
        } else {
            System.out.println (fileEntry.getName ());
        }
    }
}


public static void recursiveList (final File dir) {
	if (dir.isDirectory()) {
		for (final File item : dir.listFiles()) {
			recursiveList (item);
		}
	} else {
		System.out.println(dir.getName());
	}
}
