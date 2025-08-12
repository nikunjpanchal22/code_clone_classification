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
        File directory = new File(srcFolder);
        if(directory.list().length == 0) {
            addFileToZip(path, directory.getPath(), zip, true);
        } else {
            for(String fileName : directory.list()) {
                String folderPath = path.equals("") ? directory.getName() : path + "/" + directory.getName(); 
                addFileToZip(folderPath, srcFolder + "/" + fileName, zip, false);
            }
        }
}


