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
    if (argc < 2) {
        printf ("Usage : %s <filename>", argv[0]);
        exit (0);
    }
    FILE *fp = fopen (argv[1], "w");
    char c;
    while ((c = getchar ()) != EOF) {
        putc (c, out);
    }
    return 0;
}


