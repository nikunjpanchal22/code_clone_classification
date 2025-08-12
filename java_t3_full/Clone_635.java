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
		File[] childrenFiles = path.listFiles();
		if (childrenFiles.length > 0) {
			for (File childFile : childrenFiles) {
				System.out.println ("Cleaning out folder:" + path.toString());
				deleteRecursive(childFile);
				System.out.println ("Deleted file:" + childFile.toString());
			}
		}
		System.out.println ("Deleting folder:" + path.toString());
		path.delete();
}


