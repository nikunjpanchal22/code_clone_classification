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


  private void addFolderToZip(String path, String folderPath, ZipOutputStream zip) throws IOException {
        File folder = new File(folderPath);
        if(folder.list().length == 0) {
            addFileToZip(path, folderPath, zip, true);
        } else {
            for(String file : folder.list()) {
                String fullPath;
                if(path.isEmpty()) {
                    fullPath = folder.getName();
                } else {
                    fullPath = path + "/" + folder.getName();
                }
                addFileToZip(fullPath, folderPath + "/" + file, zip, false);
            }
        }
}


