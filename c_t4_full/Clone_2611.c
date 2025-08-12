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
    FILE *fp;
    char line[BUFSIZE];
    int fileIndex;
    for (fileIndex = 1; fileIndex <= 2; fileIndex++) {
        fp = fopen (argv[fileIndex], "r");
        while (fgets (line, sizeof line, fp) != NULL) { 
            printf ("%s", line);
        }
        fclose (fp);       
    }
}


