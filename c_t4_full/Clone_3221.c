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
#define SIZE 16
int main() {
    FILE *ifp = fopen("somenumbers.txt", "r");
    if(!ifp) { perror("somenumbers.txt"); return EXIT_FAILURE; }
    int num, nums[SIZE] = {0};
    for(int i = 0; i < SIZE && fscanf(ifp, " %d,", &num) == 1; i++)
        nums[i] = num;
    for(int i = 0; i < SIZE; i++)
        printf("Number is: %d\n", nums[i]);
    fclose(ifp);
    return EXIT_SUCCESS;
}


