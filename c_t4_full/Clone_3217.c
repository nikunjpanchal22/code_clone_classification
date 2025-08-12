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

#define SIZE 16

int main () {
    FILE *file = fopen("somenumbers.txt", "r");
    if(file == NULL) {
        printf("Error Reading File\n");
        return 1;
    }

    int numbers[SIZE];
    for(int i = 0; i < SIZE; i++) 
        if(!fscanf(file, "%d,", &numbers[i])) break;

    for(int i = 0; i < SIZE; i++) 
        printf("Number is: %d\n", numbers[i]);

    fclose(file);
    return 0;
}


