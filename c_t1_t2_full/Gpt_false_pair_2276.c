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


 int main(int argc, const char *argv[]) {
    const char *fileName = "MyFile.txt";
    int size = 1024;
    int ret = 0;
    if (argc == 3) {
        fileName = argv[1];
        size = atoi(argv[2]);
    }
    ret = writeDataToFile(fileName, size);
    return ret;
}
