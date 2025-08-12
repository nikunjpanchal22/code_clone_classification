public void deleteRecursive (File path) {
    File [] c = path.listFiles ();
    System.out.println ("Cleaning out folder:" + path.toString ());
    for (File file : c) {
        if (file.isDirectory ()) {
            System.out.println ("Deleting file:" + file.toString ());
            deleteRecursive (file);
            file.delete ();
        } else {
            file.delete ();
        }
    }
    path.delete ();
}


 public void deleteRecursive (File path) {
		System.out.println ("Cleaning out folder:" + path.toString());
		for (File child : path.listFiles()) {
			if (child.isFile()) {
				System.out.println ("Deleting file:" + child.toString());
				child.delete();
			} else if (child.isDirectory()) {
				deleteRecursive(child);
				System.out.println ("Deleted folder:" + child.toString());
			}
		}
		path.delete();
}


