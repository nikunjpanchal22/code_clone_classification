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
            File[] files = pathname.listFiles();
            for (int i = 0; i < files.length; i++) {
                File currentFile = files[i];
                currentFile.delete(); 
            }
            pathname.delete();
        } else {
            pathname.delete ();
        }
        return false;
}


