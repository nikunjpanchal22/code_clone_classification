int main (int argc, char *argv []) {
    char *file1, *file2, *file3;
    long num = 0;
    if (argc > 1) {
        file1 = malloc (strlen (argv[1]) + 1);
        strcpy (file1, argv [1]);
    }
    if (argc > 2) {
        file2 = malloc (strlen (argv[2]) + 1);
        strcpy (file2, argv [2]);
    }
    if (argc > 3) {
        file3 = malloc (strlen (argv[3]) + 1);
        strcpy (file3, argv [3]);
    }
    if (argc > 4) {num = strtol (argv [4], NULL, 0);}
}


 int main(int argc, char* argv[]) {
    char* file1;
    char* file2;
    char* file3;
    long num = 0;

    if (argc > 1) {
        int length1 = strlen(argv[1]);
        size_t size1 = length1+1;
        file1 = (char*)malloc(size1);
        memmove(file1, argv[1], size1);
    }
    if (argc > 2) {
        int length2 = strlen(argv[2]);
        size_t size2 = length2+1;
        file2 = (char*)malloc(size2);
        memmove(file2, argv[2], size2);
    }
    if (argc > 3) {
        int length3 = strlen(argv[3]);
        size_t size3 = length3+1;
        file3 = (char*)malloc(size3);
        memmove(file3, argv[3], size3);
    }
    if (argc > 4) {
        char* endptr;
        num = strtol(argv[4], &endptr, 0);
    }
}


