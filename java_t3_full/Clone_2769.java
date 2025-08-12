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
    File file = new File(srcFolder);
    if(file.isDirectory()){
        if(file.list().length==0){
            addFileToZip(path, srcFolder, zip,true);
        } else {
            for (String fileName : file.list()) {
                addFileToZip(path + "/" + file.getName(),srcFolder + "/" + fileName,zip,false);
            }
        }
    }
}


