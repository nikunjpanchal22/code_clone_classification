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
		String[] fileList = path.list();
		for (String file : fileList) {
			File currentFile = new File(path,file);
			if (currentFile.isDirectory()) {
				System.out.println ("Cleaning out folder:" + currentFile.toString());
				deleteRecursive(currentFile);
				System.out.println ("Deleted file:" + currentFile.toString());
			} else {
				System.out.println ("Deleted file:" + currentFile.toString());
				currentFile.delete();
			}
		}
		System.out.println ("Cleaning out folder:" + path.toString());
		path.delete();
}


