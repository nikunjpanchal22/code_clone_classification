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


private void addFolderToZip (String path, String srcFolderName, ZipOutputStream zip) throws IOException {
    File srcFolder = new File (srcFolderName);
    if (srcFolder.list ().length == 0) {
        addFileToZip (path, srcFolderName, zip, true);
    } else {
        for (String fileName : srcFolder.list ()) {
            if (path.equals ("")) {
                addFileToZip (srcFolder.getName (), srcFolderName + "/" + fileName, zip, false);
            } else {
                addFileToZip (path + "/" + srcFolder.getName (), srcFolderName + "/" + fileName, zip, false);
            }
        }
    }
}
