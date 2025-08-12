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
    char c;
    if (argc < 2) {
        puts ("Usage : ./a.out <filename>");
        return 1;
    }
    FILE *fp = fopen (argv[1], "w");
    if (!fp) {
        perror("fopen");
        return 1;
    }
    while ((c = getchar ()) != EOF) {
        putc (c, fp);
    }
    fclose(fp);
    return 0;
}


