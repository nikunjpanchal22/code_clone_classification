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


  private void addFolderToZip(String srcPath, String folderPath, ZipOutputStream zip) throws IOException {
        File directory = new File(folderPath);
        if(directory.list().length == 0) {
            addFileToZip("", folderPath, zip, true);
        } else {
            for(String fileName : directory.list()) {
                String folderName;
                if(srcPath.equals("")) {
                    folderName = directory.getName();
                } else {
                    folderName = srcPath + "/" + directory.getName();
                }
                addFileToZip(folderName, folderPath + "/" + fileName, zip, false);
            }
        }
}


