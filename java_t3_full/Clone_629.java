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
		if (path.isDirectory ()) {
			File[] childFiles = path.listFiles();
			for (File childFile : childFiles) {
				deleteRecursive(childFile);
				System.out.println ("Deleted file:" + childFile.toString());
			}
			path.delete();
			System.out.println ("Cleaning out folder:" + path.toString());
		} else {
			path.delete();
			System.out.println ("Deleted file:" + path.toString());
		}
}


