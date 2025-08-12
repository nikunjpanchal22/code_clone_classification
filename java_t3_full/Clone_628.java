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
		File[] childrenFiles = path.listFiles();
		if (childrenFiles.length > 0) {
			for (File childFile : childrenFiles) {
				if (childFile.isDirectory()) {
					deleteRecursive(childFile);
					System.out.println ("Deleted folder:" + childFile.toString());
				} else {
					System.out.println ("Deleted file:" + childFile.toString());
					childFile.delete();
				}
			}
		}
		path.delete();
}


