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
#define SIZE 16
int main() {
    FILE *fp;
    if ((fp = fopen("somenumbers.txt", "r")) == NULL) {
        printf("Error Reading File\n");
        return 1;
    }
    int arr[SIZE], i;
    for (i = 0; i < SIZE && fscanf(fp, "%d,", &arr[i]) == 1; i++);
    for (i = 0; i < SIZE; printf("Number is: %d\n", arr[i++]));
    return fclose(fp);
}


