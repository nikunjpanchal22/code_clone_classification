int main (int argc, char **argv) {
    char c;
    FILE *fp;
    if (argc < 2) {
        printf ("Usage : ./a.out <filename>");
        exit (0);
    }
    fp = fopen (argv[1], "w");
    while ((c = getchar ()) != EOF) {
        putc (c, fp);
    }
    return 0;
}


    


#define BUFSIZE 1024
int main (int argc, char **argv) {
    FILE *fp;
    char c;
    char buffer[BUFSIZE];
    if (argc < 2) {
        printf ("Usage : ./a.out <filename>");
        exit (0);
    }
    if ((fp = fopen(argv[1], "w")) == NULL) {
        perror("Failed to open file");
        return -1;
    }
    while (fgets(buffer, BUFSIZE, stdin) != NULL) {
        fputs(buffer, fp);
    }
    fclose(fp);
    return 0;
}


