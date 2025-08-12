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



 

int main (int argc, char *argv[]) {
    FILE *f;
    char buff[BUFSIZE];
    for(int i = 1; i < 3; i++){
        f = fopen(argv[i], "r");
        while (fscanf(f, "%s\n", buff) != EOF){
            printf("%s\n", buff);
        }
        fclose(f);
    }
}


