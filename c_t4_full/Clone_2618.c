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





int main (int argc, char *argv[]) {
    if (argc < 2) {
        printf ("Usage : %s <filename>\n", argv[0]);
        return 1;
    }
    FILE fp = *fopen (argv[1], "w");
    for (char c; (c = getchar()) != EOF;) {
        fputc(c, &fp);
    }
    return 0;
}


