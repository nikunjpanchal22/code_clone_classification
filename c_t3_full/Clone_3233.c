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
    char * work [99];
    int n, i;
    printf ("Enter total numbers: \n");
    scanf ("%d", &n );
    for(i=0;i<n;i++){
        work[i]=(char*)malloc(sizeof(char)*10);
        scanf ("%s", work[i] );
    }
    printf ( "Numbers: ");
    for(i=n-1;i>=0;i--){
        printf ("Reversed Order: %s", work [i] );
    }
    return 0;
}


