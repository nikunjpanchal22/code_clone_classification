int main () {
    FILE *pFile;
    const int n = 5;
    char mystring [n];
    int lineLength = 0;
    pFile = fopen ("myfile.txt", "r");
    if (pFile == NULL) {
        perror ("Error opening file");
    }
    else {
        do {
            fgets (mystring, n, pFile);
            puts (mystring);
            lineLength += strlen (mystring);
        }
        while (mystring[strlen (mystring) - 1] != '\n' && !feof (pFile));
        fclose (pFile);
    }
    printf ("Line Length: %d\n", lineLength);
    return 0;
}


 int main () {
    FILE *pFile;
    const size_t n = 5;
    char mystring[n];
    int lineLength = 0;
    pFile = fopen("myfile.txt", "r");
    if (pFile == NULL) {
        perror("Error opening file");
    } else {
        while (fgets(mystring, n + 1, pFile)) {
            puts(mystring);
            lineLength += strlen(mystring) - (mystring[n - 1] == '\n' ? 1 : 0);
        }
        fclose(pFile);
    }
    printf("Line Length: %d \n", lineLength);
    return 0;
}


