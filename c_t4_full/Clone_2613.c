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
    FILE *filePointers[2];
    char buffer[BUFSIZE];
    for (int i = 0; i < 2; i++) {
        filePointers[i] = fopen (argv[i + 1], "r");
        while (fgets (buffer, sizeof buffer, filePointers[i]) != NULL){ 
            printf ("%s", buffer);
        }
        fclose (filePointers[i]);
    }
}


