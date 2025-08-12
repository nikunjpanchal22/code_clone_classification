        public boolean accept (File pathname) {
            if (pathname.isDirectory ()) {
                pathname.listFiles (this);
                pathname.delete ();
            } else {
                pathname.delete ();
            }
            return false;
}


 public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            File[] files = pathname.listFiles();
            for (File file : files) {
                file.deleteOnExit();
            }
            pathname.deleteOnExit();
        } else {
            pathname.deleteOnExit();
        }
        return false;
}


