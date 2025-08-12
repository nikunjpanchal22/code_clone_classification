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
    String[] files = folder.list();
    if(files.length == 0) {
        addFileToZip(path, srcFolder, zip, true);
        return;
    }
    for(String file : files) {
        String filePath = srcFolder + "/" + file;
        String zipPath = path.equals("") ? folder.getName() : path + "/" + folder.getName();
        addFileToZip(zipPath, filePath, zip, false);
    }
}


