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
            for (File file : files) {
                if (file.exists())
				    file.delete();
            }
			pathname.delete();
        } else {
            pathname.delete ();
        }
        return false;
}


