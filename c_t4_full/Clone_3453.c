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




int main (int argc, char **argv) {
    const char *fileName = "MyFile.txt";
    int size = 1024;
    if(argc > 1) fileName = argv[1];
    if(argc > 2) size = atoi(argv[2]);
    return CreateFileSetSize (fileName, size);
}


