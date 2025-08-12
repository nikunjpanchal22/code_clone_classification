        public boolean accept (File pathname) {
            if (pathname.isDirectory ()) {
                pathname.listFiles (this);
                pathname.delete ();
            } else {
                pathname.delete ();
            }
            return false;
}



 public boolean accept (File pathname) {
        if (pathname.isDirectory()) {
            String[] files = pathname.listFiles();
            for (String file : files) {
                File currentFile = new File(pathname, file);
				currentFile.delete(); 
            }
			pathname.delete();
        } else {
            pathname.delete ();
        }
        return false;
}


