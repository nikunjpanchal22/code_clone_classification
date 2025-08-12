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
    char * strings [35];
    int n, i;
    printf ("Enter the number of elements: \n");
    scanf ("%d", &n);
    for(i=0;i<n;i++){
        strings[i] = malloc(sizeof(char)*15);
        scanf ("%s",strings [i]);
    }
    printf ("Reversed strings: ");
    for(i=n-1;i>=0;i--){
        printf (" %s", strings [i]);
    }
    return 0;
}


