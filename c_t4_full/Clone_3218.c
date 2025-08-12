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
#define ARRAY_SIZE 16
int main() {
    FILE *file = fopen("somenumbers.txt", "r");
    if(file == NULL) {
        perror("somenumbers.txt");
        return EXIT_FAILURE;
    }
    int numbers[ARRAY_SIZE];
    for(int i = 0; i < ARRAY_SIZE; i++)
        if(fscanf(file, "%d,", &numbers[i]) != 1) numbers[i] = 0;
    for(int i = 0; i < ARRAY_SIZE; i++)
        printf("Number is: %d\n\n", numbers[i]);
    fclose(file);
    return EXIT_SUCCESS;
}


