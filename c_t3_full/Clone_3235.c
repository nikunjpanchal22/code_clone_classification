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
    char * words [20];
    int ksr, i;
    printf ("Enter the total words: \n");
    scanf ("%d", &ksr);
    for (i=0;i<ksr;i++){
        words[i]=(char*)malloc(sizeof(char)*80);
        scanf(" %s", words[i]);
    }
    for(i=ksr-1;i>=0;i--){
        printf ("Reversed word: %s", words[i]);
        free(words[i]);
    }
    return 0;
}


