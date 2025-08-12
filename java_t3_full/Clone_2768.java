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
    if(directory.listFiles().length == 0) {
        addFileToZip(path, srcFolder, zip, true);
    } else {
        for(File file : directory.listFiles()) {
            String srcPath = srcFolder + "/" + file.getName();
            addFileToZip(path.isEmpty() ? directory.getName() : path + "/" + directory.getName(), srcPath, zip, false);
        }
    }
}


