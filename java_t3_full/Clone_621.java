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
            List<File> files = Arrays.asList(pathname.listFiles());
            for (File file : files) {
                file.delete();
            }
            pathname.delete();
        } else {
            pathname.delete ();
        }
        return false;
}


