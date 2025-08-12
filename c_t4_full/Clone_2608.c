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
    char buf1[BUFSIZE], buf2[BUFSIZE];
    FILE* fp1 = fopen(argv[1], "r");
    FILE* fp2 = fopen(argv[2], "r");       
    while (fgets(buf1, sizeof(buf1), fp1)) {
        printf("%s", buf1);
    }
    while (fgets(buf2, sizeof(buf2), fp2)) {
        printf("%s", buf2);
    }
    fclose(fp1);
    fclose(fp2);
    return 0;
}


