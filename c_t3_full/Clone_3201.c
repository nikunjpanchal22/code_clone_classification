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



#include<stdio.h>
#include<stdlib.h>
int main () {
    int arr[16], i;
    FILE* fileptr = fopen("somenumbers.txt", "r");
    if(!fileptr) {
        puts("Error Reading File");
        exit(1);
    }
    for(i = 0; i < 16; i++) fscanf(fileptr, "%d,", &arr[i]);
    for(i = 0; i < 16; i++) printf("Number is: %d\n", arr[i]);
    fclose(fileptr);
    return 0;
}


