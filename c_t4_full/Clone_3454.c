int main (int argc, const char *argv []) {
    const char *fileName = "MyFile.txt";
    int size = 1024;
    int ret = 0;
    if (3 == argc) {
        fileName = argv[1];
        size = atoi (argv[2]);
    }
    ret = CreateFileSetSize (fileName, size);
    return ret;
}




int main (int argc, const char *argv []) {
    int size, ret=0;
    char *fileName;
    fileName = (argc < 3) ? "MyFile.txt" : argv[1];
    size = (argc < 3) ? 1024 : atoi(argv[2]);
    ret = CreateFileSetSize (fileName, size);
    return ret;
}


