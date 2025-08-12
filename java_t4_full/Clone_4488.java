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
    String[] fileNames = folder.list();
    boolean isEmpty = fileNames.length == 0;

    for(int i = 0; i < (isEmpty ? 1 : fileNames.length); i++) {
        String filePath = srcFolder + "/" + (isEmpty ? "" : fileNames[i]);
        String zipPath = (path.equals("") ? folder.getName() : path + "/" + folder.getName()) + (isEmpty ? "" : "/" + fileNames[i]);
        addFileToZip(zipPath, filePath, zip, isEmpty);
    }
}


