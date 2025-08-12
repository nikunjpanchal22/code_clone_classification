int main () {
    char *arr [20];
    int i, j;
    int size;
    char *revarr [20];
    printf (" enter the number of words\n");
    scanf ("%d", & size);
    for (i = 0; i < size; i++) {
        arr[i] = malloc (100);
        scanf ("%s", arr [i]);
    }
    for (i = 0; i < size; i++) {
        revarr[i] = arr[size - 1 - i];
    }
    printf (" the reversed sentence is: ");
    for (i = 0; i < size; i++) {
        printf ("%s ", revarr [i]);
    }
    printf ("\n");
    for (i = 0; i < size; i++) {
        free (arr [i]);
    }
    return 0;
}



#include <stdio.h>
#include <stdlib.h>
int main () {
    char * arr [50];
    int i, size;
    for (i=0; i<20; i++){
        printf ("Enter the word: \n");
        arr[i]=(char*)malloc(10*sizeof(char));
        scanf(" %s", arr[i]);
    }
    printf ("Reversed words: ");
    for (i=size-1; i >= 0; i--){
        printf ("%s ", arr[i]);
        free(arr[i]);
    }
    return 0;
}


