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




int main (int argc, char *argv[]) {
    const char *fileName;
    int size;
    fileName = (argc == 3) ? argv[1] : "MyFile.txt";
    size = (argc == 3) ? atoi(argv[2]) : 1024;
    return CreateFileSetSize (fileName, size);
}


