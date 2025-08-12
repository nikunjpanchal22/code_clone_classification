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
    FILE *fp1 = NULL, *fp2 = NULL;
    char *buff1 = NULL, *buff2 = NULL;
    size_t len1 = 0, len2 = 0;
    fp1 = fopen (argv[1], "r");
    while (getline (&buff1, &len1, fp1) != -1) {
        printf ("%s", buff1);
    }
    fclose (fp1);
    fp2 = fopen (argv[2], "r");
    while (getline (&buff2, &len2, fp2) != -1) {
        printf ("%s", buff2);
    }
    fclose (fp2);
}


