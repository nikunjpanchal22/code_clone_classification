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



#include <stdio.h>
#include <string.h>
#define n 5
int main () {
    FILE *file;
    char str[n];
    int length = 0;
    file = fopen("test.txt","r");
    if (file == NULL) return -1;
    do {
        fgets(str,n, file);
        printf("%s", str);
        length += strlen(str);
    }
    while (str[strlen(str)-1] != '\n' && !feof(file));
    printf("\nLine length: %d\n",length);
    fclose(file);
    return 0;
}


