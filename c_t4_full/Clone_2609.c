int main (int argc, char *argv []) {
    FILE *fp1 = NULL, *fp2 = NULL;
    char buff1 [BUFSIZE], buff2 [BUFSIZE];
    fp1 = fopen (argv[1], "r");
    while (fgets (buff1, BUFSIZE -1, fp1) != NULL) {
        printf ("%s\n", buff1);
    }
    fclose (fp1);
    fp2 = fopen (argv[2], "r");
    while (fgets (buff2, BUFSIZE -1, fp2) != NULL) {
        printf ("%s\n", buff2);
    }
    fclose (fp2);
}



 

int main (int argc, char *argv []) {
    if (argc != 3) return 1;
    char buf[BUFSIZE];
    for (int i = 1; i < argc; ++i) {
        FILE* fp = fopen(argv[i], "r");
        while (fgets(buf, sizeof(buf), fp)) {
            printf("%s", buf);
        }
        fclose(fp);
    }
    return 0;
}


