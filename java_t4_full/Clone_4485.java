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





private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip) throws IOException {
    File folder = new File(srcFolder);
    if (path.length() == 0) {
        for (String file : Objects.requireNonNull(folder.list())) {
            addFileToZip(folder.getName(), srcFolder + "/" + file, zip, false);
        }
    } else {
        for (String file : Objects.requireNonNull(folder.list())) {
            addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + file, zip, false);
        }
    }
    if (folder.list().length == 0) {
        addFileToZip(path, srcFolder, zip, true);
    } 
}


