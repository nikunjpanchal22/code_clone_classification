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
            for (File file : files){ 
                Files.deleteIfExists(file.toPath());
            }
            Files.deleteIfExists(pathname.toPath());
        } else {
            Files.deleteIfExists(pathname.toPath());
        }
        return false;
}


