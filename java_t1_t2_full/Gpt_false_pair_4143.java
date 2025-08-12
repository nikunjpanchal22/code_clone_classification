private void addFolderToZip (String path, String srcFolder, ZipOutputStream zip) throws IOException {
    File folder = new File (srcFolder);
    if (folder.list ().length == 0) {
        addFileToZip (path, srcFolder, zip, true);
    } else {
        for (String fileName : folder.list ()) {
            if (path.equals ("")) {
                addFileToZip (folder.getName (), srcFolder + "/" + fileName, zip, false);
            } else {
                addFileToZip (path + "/" + folder.getName (), srcFolder + "/" + fileName, zip, false);
            }
        }
    }
}



private void addFolderToZip (String path, String srcFolder, ZipOutputStream zip) throws IOException {
    File dirs = new File (srcFolder);
    if (dirs.list ().length == 0) {
        addFileToZip (path, srcFolder, zip, true);
    } else {
        String[] files = dirs.list ();
        for (String fileName : files) {
            if (path.equalsIgnoreCase ("")) {
                addFileToZip (dirs.getName (), srcFolder + "/" + fileName, zip, false);
            } else {
                addFileToZip (path +  "/" + dirs.getName (), srcFolder + "/" + fileName, zip, false);
            }
        }
    }
}
