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





int main (int argc, char **argv) {
    int c;
    FILE *fp;
    if (argc < 2) exit (printf ("Usage : %s <filename>", argv[0]));
    fp = fopen (argv[1], "w");
    do {
        c = getchar();
        putc (c, fp);
    } while (c != EOF);
    fclose(fp);
    return 0;
}


