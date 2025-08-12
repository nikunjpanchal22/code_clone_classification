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
    char * variable [55];
    int v, i;
    printf ("Enter variable count \n ");
    scanf ( "%d", &v );
    for(i=0; i<v ; i++){
        variable[i] = malloc(sizeof(char)*10);
        scanf ("%s", variable[i] );
    }
    printf("Reversed Order: ");
    for(i=v-1; i>=0 ; i--){
        printf ("%s ", variable [i] );
    }
    return 0;
}


