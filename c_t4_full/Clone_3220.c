int main () {
    FILE *myFile;
    myFile = fopen ("somenumbers.txt", "r");
    int numberArray [16];
    int i;
    if (myFile == NULL) {
        printf ("Error Reading File\n");
        exit (0);
    }
    for (i = 0; i < 16; i++) {
        fscanf (myFile, "%d,", & numberArray [i]);
    }
    for (i = 0; i < 16; i++) {
        printf ("Number is: %d\n\n", numberArray [i]);
    }
    fclose (myFile);
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#define MAX 16
int main() {
    FILE *fptr = fopen("somenumbers.txt", "r");
    if(fptr == NULL) {
        fprintf(stderr, "Error Reading File\n");
        exit(EXIT_FAILURE);
    }
    int numberArray[MAX], i;
    for(i = 0; i < MAX && fscanf(fptr, "%d,", &numberArray[i]) != EOF; i++);
    for(i = 0; i < MAX; i++)
        fprintf(stdout, "Number is: %d\n\n", numberArray[i]);
    fclose(fptr);
    return EXIT_SUCCESS;
}


