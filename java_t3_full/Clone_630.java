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
		if (path.isFile()) {
			System.out.println ("Deleting file:" + path.toString());
			path.delete();
		} else if (path.isDirectory()) {
			for (File childFile : path.listFiles()) {
				deleteRecursive(childFile);
				System.out.println ("Deleted file:" + childFile.toString());
			}
			System.out.println ("Deleting folder:" + path.toString());
			path.delete();
		}    
}


