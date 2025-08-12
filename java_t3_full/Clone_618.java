        public boolean accept (File pathname) {
            if (pathname.isDirectory ()) {
                pathname.listFiles (this);
                pathname.delete ();
            } else {
                pathname.delete ();
            }
            return false;
}


 public boolean accept (File pathname){
        if (pathname.isDirectory()){
            String[] files = pathname.list();
            for (String file : files){
                File currentFile = new File(pathname.getAbsolutePath(), file);
                currentFile.delete();
            }
            pathname.delete();
        }else{
            pathname.delete();
        }
        return false;
}


