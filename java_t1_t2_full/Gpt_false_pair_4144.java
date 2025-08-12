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
    File directory = new File (srcFolder);
    if (directory.list ().length == 0) {
        addFileToZip (path, srcFolder, zip, true);
    } else {
        for (File file : directory.listFiles ()) {
            if (path.equals ("")) {
                addFileToZip (directory.getName (), srcFolder + "/" + file.getName (), zip, false);
            } else {
                addFileToZip (path + "/" + directory.getName (), srcFolder + "/" + file.getName (), zip, false);
            }
        }
    }
}
