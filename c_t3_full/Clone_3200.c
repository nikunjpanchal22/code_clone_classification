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
int main() {
    FILE *file;
    if (!(file = fopen("somenumbers.txt","r"))) {
        printf("Error Reading File\n");
        exit(1);
    }
    int array[16],  i;
    for(i = 0; i < 16; i++)
        if (fscanf(file,"%d,",array+i)!=1) array[i]=0;
    for(i = 0; i < 16; i++)
        printf("Number is: %d\n", array[i]);
    fclose(file);
    return 0;
}


