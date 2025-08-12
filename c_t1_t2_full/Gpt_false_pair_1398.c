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
    char buff1 [BUFSIZE], buff2 [BUFSIZE];
	int bytesRead1 = 0, bytesRead2 = 0;
    fp1 = fopen (argv[1], "r");
    while ((bytesRead1 = fread (buff1, 1, BUFSIZE - 1, fp1)) != 0 ) {
        printf ("%s\n", buff1);
    }
    fclose (fp1);
    fp2 = fopen (argv[2], "r");
    while ((bytesRead2 = fread (buff2, 1, BUFSIZE - 1, fp2)) != 0 ) {
        printf ("%s\n", buff2);
    }
    fclose (fp2);
}
