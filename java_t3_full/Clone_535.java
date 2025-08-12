boolean isBinaryFile (File f) throws IOException {
    String type = Files.probeContentType (f.toPath ());
    if (type == null) {
        return true;
    } else if (type.startsWith ("text")) {
        return false;
    } else {
        return true;
    }
}


boolean isBinaryFile(File f) throws IOException {
    String type = Files.probeContentType(f.toPath());
    
    switch(type) {
        case null:
            return true;
        case "text":
            return false;
        default: 
            return true;
    }
}


