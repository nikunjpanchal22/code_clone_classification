int main (int argc, char *argv []) {
    if (argc < 2) {
        printf ("Program needs an int argument!\n");
        return 1;
    }
    int n = atoi (argv[1]);
    if (n < 1 || n > 10) {
        printf ("The argument must be in the range 1-10!\n");
        return 2;
    }
    int test [n];
    return 0;
}


	int main (int argc, char *argv []) {
    if (argc < 2) {
        printf ("Program needs an int argument!\n");
        return 1;
    }
    int n = sscanf(argv[1], "%d", &n);
    if (n == 1){
        if (n < 1 || n > 10) {
            printf ("The argument must be in the range 1-10!\n");
            return 3;
        }
        int test [n];
        return 0;
    }
    else {
        printf ("The argument must be an int!\n");
        return 2;
    }
    
}


