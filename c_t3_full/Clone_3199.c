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
int main(){
    FILE *file;
    file=fopen("somenumbers.txt", "r");
    if(file==NULL){
        printf("Error Reading File\n");
        exit(EXIT_FAILURE);
    }
    int i, numberArray[MAX];
    for(i = 0; i < MAX; i++){
        if (fscanf(file, "%d,", &numberArray[i]) == EOF)
            break;
    }
    for(i = 0; i < MAX; i++){
        printf("Number is: %d\n", numberArray[i]);
    }
    fclose(file);
    return EXIT_SUCCESS;
}


